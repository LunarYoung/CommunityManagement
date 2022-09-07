import request from '@/utils/request'

export function addAction(data) {
  return request({
    url: '/Action/addAction',
    method: 'post',
    data
  })
}

export function addNotice(data) {
  return request({
    url: '/Action/addNotice',
    method: 'post',
    data
  })
}

export function selectAction(data) {
  return request({
    url: '/Action/selectAction',
    method: 'post',
    data
  })
}

export function updateStatus(data) {
  return request({
    url: '/Action/updateStatus',
    method: 'post',
    data
  })
}
