// pages/applyAssociation/applyAssociation.js
const app = getApp()
Page({

    /**
     * 页面的初始数据
     */
    data: {
        fileList: undefined,
        show: false,
        columns: [],
        h:{
            minHeight: 80 
         },
        from:{
            name:'',
            introduce:'',
            image:''
          }
    },
    afterRead(event) {
        var that = this
        const { file } = event.detail;
        // 当设置 mutiple 为 true 时, file 为数组格式，否则为对象格式
        wx.uploadFile({
          url: 'http://127.0.0.1:8080/AppDus/upImage', // 仅为示例，非真实的接口地址
          filePath: file.url,
          name: 'file',
          formData: { user: file },
          success(res) {
            // console.log(res.data)
            // that.setData({ 
            //   fileList:res.data
            // });
            const { fileList = [] } = that.data;
           fileList.push({ ...file, url: res.data });
           that.setData({ fileList });
           that.setData({'from.image':res.data})
          },
        });
      },
    /**
     * 生命周期函数--监听页面加载
     */
    showPopup() {
        this.setData({ show: true });
      },
      onChange(event) {
        const { picker, value, index } = event.detail;
        console.log(event.detail.value)
        this.setData({
          'from.applyAssociation':event.detail.value,
        })
        this.setData({ show: false });
      },
      onClickIn(e) {
        this.setData({
          'from.introduce':e.detail
        })
      },
      onClickName(e) {
      this.setData({
        'from.name':e.detail
      })
    },

    clickBtn: function () {
        // wx.setStorage({
        //   key: "address", data: this.data.address,
        //   //key: "userId", data: res.data.userId,
        // })
        var that = this
        wx.request({
          method: "post",
          url: app.globalData.URL + 'Apply/addApply',
          data: this.data.from,
          header: {
            'content-type':'application/json' 
          },
          success(res) {
            wx.showToast({
              title: '提交成功',
              image: "/asset/success.png",
              duration: 700,
              mask: true
            })
            that.setData({
                from:'',
                fileList:''
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
      },
    onLoad: function (options) {
        var that = this;
        wx.getStorage({
          key: 'user',
          success: function (res) {
            console.log(res.data)
            that.setData({
              from: res.data
            })
          },
        })

        wx.request({
            method: "get",
            url: app.globalData.URL + 'Index/assList',
            success(res) {
                that.setData({
                    columns: res.data
                  })
            },
            fail(res) {
            
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