import request from '@/utils/request'

export function Dashboard() {
  return request({
    url: '/Dashboard/base',
    method: 'get'
  })
}
export function grade() {
  return request({
    url: '/Dashboard/grade',
    method: 'get'
  })
}

export function pie() {
  return request({
    url: '/Dashboard/pie',
    method: 'get'
  })
}
