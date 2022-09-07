// pages/detailedAcitivtyArticle/detailedActivtyArticle.js
const app = getApp()
Page({

    /**
     * 页面的初始数据
     */
    data: {
        article:{},
        sms:'',
        commentList:[],
        starNum:3,
        starFlag: false,
        upComment:{
          articleId:'',
          name:'',
          avatarUrl:'',
          content:'0',
          star:''
     },
        content:''
    },
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
             url: app.globalData.URL + 'Article/addArticleComment',
             data: this.data.upComment,
             header: {
               'content-type': 'application/json' 
             },
             success(res) {
                
              wx.request({
                method: "post",
                url: app.globalData.URL + 'Article/appViewId',
                header: {
                    'content-type': 'application/x-www-form-urlencoded' //修改此处即可
                  },
                  data: {
                    id: that.data.upComment.articleId,
                  },
                success(res) {
                    that.setData({
                        article:res.data[1],
                        commentList:res.data[0],
                        sms:''
                    })
                },
                fail(res) {
                 
                },
              })
             },
           })
      }  
   },
    /**
     * 生命周期函数--监听页面加载
     */
    clickAdd: function () {
        this.setData({
           'article.star' : this.data.article.star + 1,
            starFlag : true
          })
          console.log("++++")
          wx.request({
            method: "post",
            url: app.globalData.URL + 'Article/autoAddArticleStar',
            header: {
                'content-type': 'application/x-www-form-urlencoded' //修改此处即可
              },
              data: {
                id:this.data.upComment.articleId,
              },
            success(res) {
                // that.setData({
                //     dus:res.data.appDusDetail,
                //     commentList:res.data.commentList,
                // })
               
            },
            fail(res) {
             
            },
          })

    },
    clickRe: function () {
        this.setData({
            starNum : this.data.starNum - 1,
            starFlag : false
          })
     },
    onLoad: function (options) {
        var that = this
       console.log(options)
       wx.request({
        method: "post",
        url: app.globalData.URL + 'Article/appViewId',
        header: {
            'content-type': 'application/x-www-form-urlencoded' //修改此处即可
          },
          data: {
            id: options.index,
          },
        success(res) {
            that.setData({
                article:res.data[1],
                commentList:res.data[0],
                'upComment.articleId':res.data[1].id
            })
            console.log(res.data[1])
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