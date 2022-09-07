// pages/detailedAcitivtyArticle/detailedActivtyArticle.js
const app = getApp()
Page({

    /**
     * 页面的初始数据
     */
    data: {
        dus:{},
        sms:'',
        upFlage:false,
        upComment:{
             dusId:'',
             name:'',
             avatarUrl:'',
             content:'0',
             star:''
        },
        commentList:[],
        starNum:3,
        starFlag: false,
        content:''
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onChangeTitle(e) {
        this.setData({
          'upComment.content':e.detail,
           content:e.detail,
          'upComment.star':0,
          upFlage:true
        })
      },

      upbtn:function(){
         if(this.data.content.length !== 0){
             var that =this
            wx.request({
                method: "post",
                url: app.globalData.URL + 'AppDus/upDusComment',
                data: this.data.upComment,
                header: {
                  'content-type': 'application/json' 
                },
                success(res) {
                   
                    wx.request({
                        method: "post",
                        url: app.globalData.URL + 'AppDus/appDusViewId',
                        header: {
                            'content-type': 'application/x-www-form-urlencoded' //修改此处即可
                          },
                          data: {
                            id: that.data.upComment.dusId,
                          },
                        success(res) {
                            that.setData({
                                dus:res.data.appDusDetail,
                                commentList:res.data.commentList,
                                sms:''
                            })
                            console.log(res.data)
                        },
                        fail(res) {
                        },
                      })

                  wx.showToast({
                    title: '提交成功',
                    image: "/asset/success.png",
                    duration: 700,
                    mask: true
                  })
          
                },
                fail(res) {
                  wx.showToast({
                    title: '提交失败',
                    image: "/asset/fail.png",
                    duration: 700,
                    mask: true
                  })
                },
              })
         }  
      },

    clickAdd: function () {
        var that =this
        this.setData({
            'dus.star' : this.data.dus.star + 1,
            starFlag : true
          })
          
          wx.request({
            method: "post",
            url: app.globalData.URL + 'AppDus/autoAddDusStar',
            header: {
                'content-type': 'application/x-www-form-urlencoded' //修改此处即可
              },
              data: {
                id:that.data.upComment.dusId,
              },
            success(res) {
                that.setData({
                    dus:res.data.appDusDetail,
                    commentList:res.data.commentList,
                })
               
            },
            fail(res) {
             
            },
          })
      
    },
    clickRe: function () {
        // this.setData({
        //     'dus.star' : this.data.dus.star - 1,
        //     starFlag : false
        //   })
     },
    onLoad: function (options) {


        var that = this
       console.log(options)
       that.setData({
           'upComment.dusId':options.index
       })
       wx.request({
        method: "post",
        url: app.globalData.URL + 'AppDus/appDusViewId',
        header: {
            'content-type': 'application/x-www-form-urlencoded' //修改此处即可
          },
          data: {
            id: options.index,
          },
        success(res) {
            that.setData({
                dus:res.data.appDusDetail,
                commentList:res.data.commentList,
            })
            console.log(res.data)
        },
        fail(res) {
         
        },
      })
      var that = this
      wx.getStorage({
        key: 'avatarUrl',
        success: function (res) {
          that.setData({
            'upComment.avatarUrl': res.data
          })
        },
      })
      wx.getStorage({
        key: 'name',
        success: function (res) {
          that.setData({
            'upComment.name': res.data
          })
        },
      })
    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})