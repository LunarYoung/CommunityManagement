// pages/phone.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    user:{
      openId:"",
      name:"",
      sex:"",
      grade:"",
      depart:"",
      address:"",
      phone:""
    },
    show: false,
    address:"",
    userId: ""
  },

  input: function (e) {
    var address=e.detail
    this.setData({
      'user.address':e.detail
    })
  },

  clickBtn: function () {
    wx.setStorage({
      key: "user", data: this.data.user,
      //key: "userId", data: res.data.userId,
    })
    wx.request({
      method: "post",
      url: app.globalData.URL + 'appUser/editUser',
      data: this.data.user,
      header: {
        'content-type': 'application/json' 
      },
      success(res) {
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
    this.setData({ show: false });
  },
  showPopup() {
    this.setData({ show: true });
  },
  onClose() {
    // this.setData({ show: false });
    // wx.showToast({
    //   title: '提交成功',
    //   image: "/assest/su.png",
    //   duration: 700,
    //   mask: true
    // })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (e) {
    var that = this;
    wx.getStorage({
      key: 'user',
      success: function (res) {
        console.log(res.data)
        that.setData({
          user: res.data
        })
      },
    })
    wx.getStorage({
      key: 'openId',
      success: function (res) {
        console.log(res.data)
        that.setData({
          'user.openId': res.data
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