// pages/detailedAcitivtyArticle/detailedActivtyArticle.js
const app = getApp()
import Dialog from '@vant/weapp/dialog/dialog';
Page({

  /**
   * 页面的初始数据
   */
  data: {
    status:'xxx',
    url:"https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQW8DCXniaAgfTCWM63NS2PeoQ/132"
  },

  /**
   * 生命周期函数--监听页面加载
   */

  onLoad: function (e) {
    wx.request({
      method: "get",
      url: app.globalData.URL + 'Applets/select',
      success(res) {
        that.setData({
          status:res.data.data.status
          
      })
      },
      fail(res) {
       
      },
    })

    var that = this;
    wx.getStorage({
      key: 'url',
      success: function (res) {
        console.log(res.data)
        that.setData({
          url: res.data
        })
      },
    })
  },


  tip(){
    Dialog.alert({
      title: '声明',
      message: this.data.status,
    }).then(() => {
    });
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