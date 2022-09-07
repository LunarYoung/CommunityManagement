// pages/ing/ing.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
     list:[],
     openId:'',
  },

  /**
   * 生命周期函数--监听页面加载
   */
  sign(event){
    var that =this
    var e = event.currentTarget.dataset.id;//使用event.currentTarget.dataset.XX获取内容
    console.log(e.id);
    wx.request({
      method: "post",
      url: app.globalData.URL + 'Index/sign',
      data:({
       id:e.id,
      }),
      header: {
        'content-type': 'application/x-www-form-urlencoded' 
      },
      success(res) {
       
        wx.request({
          method: "post",
          url: app.globalData.URL + 'Index/appNotice',
          data:({
           id:that.data.openId,
          }),
          header: {
            'content-type': 'application/x-www-form-urlencoded' 
          },
          success(res) {
            that.setData({
              list: res.data
            })
          },
          fail(res) {
           
          },
        })
      },
      fail(res) {
       
      },
    })
  },
  onLoad: function (options) {
    var that = this;
    wx.getStorage({
      key: 'openId',
      success: function (res) {
        console.log(res.data)
        that.setData({
          openId: res.data
        })
        wx.request({
          method: "post",
          url: app.globalData.URL + 'Index/appNotice',
          data:({
           id:that.data.openId,
          }),
          header: {
            'content-type': 'application/x-www-form-urlencoded' 
          },
          success(res) {
            that.setData({
              list: res.data
            })
          },
          fail(res) {
           
          },
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