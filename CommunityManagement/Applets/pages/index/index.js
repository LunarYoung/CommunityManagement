// index.js
// 获取应用实例
const app = getApp()

Page({
  data: {
    isLogin:false,
    name:'',
    url:'',
    img:{},
    list:[],
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    canIUseGetUserProfile: false,
    canIUseOpenData: wx.canIUse('open-data.type.userAvatarUrl') && wx.canIUse('open-data.type.userNickName') // 如需尝试获取用户信息可改为false
  },
  // 事件处理函数
  bindViewTap() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad() {
    if (wx.getUserProfile) {
      this.setData({
        canIUseGetUserProfile: true
      })
    }
  },
 

  getUserProfile: function(e){
    this.setData({
      isLogin:true
    })
    var that = this
    wx.getUserProfile({
      desc: '业务需要',
      success: res => { 
        wx.setStorage({
          key: "name", data:res.userInfo.nickName,
        })
        wx.setStorage({
          key: "avatarUrl", data:res.userInfo.avatarUrl,
        })
       
      }
    })
  },

  getDetail:function(e){
  
    let index = e.currentTarget.dataset.index
    wx.navigateTo({
      // url: '../../pages/detailedAcitivtyArticle/detailedActivtyArticle"='+ event.currentTarget.dataset.postidIdex,
       url: '../../pages/detailedAcitivtyArticle/detailedActivtyArticle?index='+ index
    })
    
  },


  onLoad: function (e) {
    var that = this
    wx.request({
      method: "get",
      url: app.globalData.URL + 'Index/indexList',
      success(res) {
        that.setData({
         img:res.data.img,
         list:res.data.article
        })
        
      },
      fail(res) {
      
      },
    })

  
  },
})
