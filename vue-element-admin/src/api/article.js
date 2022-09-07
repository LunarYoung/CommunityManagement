import request from '@/utils/request'

export function fetchList(query) {
  return request({
    // url: '/vue-element-admin/article/list',

    method: 'get',
    params: query,
    baseURL: 'xxxx'
  })
}

export function queryApplets() {
  return request({
    url: '/Applets/select',
    method: 'get'
  })
}

export function querySign(data) {
  return request({
    url: '/Action/querySign',
    method: 'post',
    data
  })
}

export function updateApplets(data) {
  return request({
    url: '/Applets/Applets',
    method: 'post',
    data
  })
}

export function feedbackList(data) {
  return request({
    url: '/feedback/feedbackList',
    method: 'post',
    data
  })
}

export function selectManage(data) {
  return request({
    url: '/Applets/selectManage',
    method: 'post',
    data
  })
}
export function deleteManage(name) {
  return request({
    url: '/Applets/deleteManage',
    method: 'post',
    params: { name }
  })
}

export function publicList(data) {
  return request({
    url: '/Public/manage',
    method: 'post',
    data
  })
}

export function fetchArticle(id) {
  return request({
    url: '/vue-element-admin/article/detail',
    method: 'get',
    params: { id }
  })
}

export function fetchPv(pv) {
  return request({
    url: '/vue-element-admin/article/pv',
    method: 'get',
    params: { pv }
  })
}

export function createArticle(data) {
  return request({
    url: '/vue-element-admin/article/create',
    method: 'post',
    data
  })
}

export function add(data) {
  return request({
    url: '/Article/add',
    method: 'post',
    data
  })
}

export function addItem(data) {
  return request({
    url: '/Public/add',
    method: 'post',
    data
  })
}

export function getArticleList(data) {
  return request({
    url: '/Article/getArticleList',
    method: 'post',
    data
  })
}

export function deleteId(id) {
  return request({
    url: '/Article/deleteId',
    method: 'post',
    params: { id }
  })
}

export function viewId(id) {
  return request({
    url: '/Article/viewId',
    method: 'post',
    params: { id }
  })
}

export function Base() {
  return request({
    url: '/Article/base',
    method: 'get'
  })
}
