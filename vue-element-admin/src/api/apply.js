import request from '@/utils/request'

export function applyList(data) {
  return request({
    url: '/Apply/ApplyList',
    method: 'post',
    data
  })
}

export function getHistoryAllApplyList(data) {
  return request({
    url: '/Apply/getHistoryAllApplyList',
    method: 'post',
    data
  })
}

export function queryMember(data) {
  return request({
    url: '/Apply/queryMember',
    method: 'post',
    data
  })
}
export function queryHistoryMember(data) {
  return request({
    url: '/Apply/queryHistoryMember',
    method: 'post',
    data
  })
}

export function updateStatus(data) {
  return request({
    url: '/Apply/updateStatus',
    method: 'post',
    data
  })
}
