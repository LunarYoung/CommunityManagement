// pages/my_com/my_com.js
import Dialog from '@vant/weapp/dialog/dialog';
import Toast from '@vant/weapp/toast/toast';
import Notify from '@vant/weapp/notify/notify';
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    MyApply : [
    ],
    reason:"",
    openId:"",
    radio: '1',
    show: false,
    columns: ['个人原因', '社团氛围不好', '社团人员关系', '部长问题', '其他'],
  },
  tip(e){
    console.log(e)
    this.setData({ show: true });
  },
  confirm() {
    wx.request({
      method: "post",
      url: app.globalData.URL + 'Applets/reason',
      data: {
        openId: this.data.openId,
        reason: this.data.reason
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: (res) => {
        Notify({ type: 'success', message: '你已提交' });
      }
    })
   
  },

  onClose() {
    this.setData({ show: false });
  },

  onChange(event) {
    const { picker, value, index } = event.detail;
    Toast(`当前值：${value}, 当前索引：${index}`);
    console.log(event.detail)
    this.setData({ reason: event.detail });
  },

  // onChange(event) {
  //   this.setData({
  //     radio: event.detail,
  //   });
  // },

  // tip(){
  //   Dialog.confirm({
    
  //   })
  //     .then(() => {
  //       // on confirm
  //     })
  //     .catch(() => {
  //       // on cancel
  //     });
  // },

 onClose(event) {
    const { position, instance } = event.detail;
    switch (position) {
      case 'left':
      case 'cell':
        instance.close();
        break;
      case 'right':
        Dialog.confirm({
          message: '确定删除吗？',
        }).then(() => {
          instance.close();
        });
        break;
    }
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
            url: app.globalData.URL + 'Applets/my/com',
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