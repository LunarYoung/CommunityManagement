// pages/dus/dus.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
     list:[],
     sort:1,
    option2: [
      { text: '默认排序', value: '1' },
      { text: '回复排序', value: '2' },
      { text: '热度排序', value: '3' },
    ],
   
    value2: '1',
  
  },

  change(e){
    console.log(e.detail)
    var that = this
    wx.request({
      method: "post",
      url: app.globalData.URL + 'AppDus/queryAppDus',
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        sort:e.detail
      },
      success(res) {
        that.setData({
         list:res.data,
        })
        
      },
      fail(res) {
      
      },
    })
    
},
  queryAppDus(){
    var that = this
    wx.request({
      method: "post",
      url: app.globalData.URL + 'AppDus/queryAppDus',
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        sort:this.data.sort
      },
      success(res) {
        that.setData({
         list:res.data,
        })
        
      },
      fail(res) {
      
      },
    })
  } ,
  getDetail:function(e){
  
    let index = e.currentTarget.dataset.index
    wx.navigateTo({
      // url: '../../pages/detailedAcitivtyArticle/detailedActivtyArticle"='+ event.currentTarget.dataset.postidIdex,
       url: '../../pages/detailedDus/detailedDus?index='+ index
    })
    
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this
    wx.request({
      method: "post",
      url: app.globalData.URL + 'AppDus/queryAppDus',
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        sort:this.data.sort
      },
      success(res) {
        that.setData({
         list:res.data,
        })
        console.log(res.data)
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