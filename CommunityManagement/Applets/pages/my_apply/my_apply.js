// pages/my_apply/my_apply.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    MyApply : [
    ],
    steps: [
      {
        text: '提交申请',
        desc: '等待中',
      },
      {
        text: '初试',
        desc: '通过'
      },
      {
        text: '面试',
        desc: '通过',
      },
    
    ],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad:  function (options) {
    var that = this;
     wx.getStorage({
      key: 'openId',
      success: function (res) {
        console.log(res.data)
        that.setData({
          openId: res.data
        },() =>{
          wx.request({
            method: "post",
            url: app.globalData.URL + 'Applets/my/apply',
            data: {
              openId: that.data.openId
            },
            header: {
              'content-type': 'application/x-www-form-urlencoded'
            },
            success: (res) => {
               console.log(res.data);
              that.setData({
                MyApply: res.data,
              
              });
            }
          })
        }
        )
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