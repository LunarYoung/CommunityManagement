// app.js
App({
  onLaunch() {
    // 展示本地存储能力
    const logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)

    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
        if (res.code) {
          wx.request({
            url: 'http://localhost:8080/appUser/getOpenid',
            method: 'POST',
            data: {
              code: res.code
            },
            header: {
              'content-type': 'application/json'
            },
            success(res) {
              console.log("openid:"+res.data);
              if (res.data != "" || res.data!=null){
                // 登录成功
                wx.setStorageSync("openId", res.data);//将用户id保存到缓存中
               
              }else{
                // 登录失败
                // TODO 跳转到错误页面，要求用户重试
                return false;
              }
            }
          })
        } else {
          console.log('获取用户登录态失败！' + res.errMsg)
        }
      }
    })
  },
  globalData: {
    userInfo: null,
    URL: 'http://127.0.0.1:8080/',
  }
})
