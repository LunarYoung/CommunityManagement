import request from '@/utils/request'

export function login(data) {
  return request({
    url: '/role/login',
    method: 'post',
    data
  })
}

export function getInfo(token) {
  return request({
    url: '/role/info',
    method: 'get',
    params: { token }
  })
}

export function logout() {
  return request({
    url: '/role/logout',
    method: 'post'
  })
}
