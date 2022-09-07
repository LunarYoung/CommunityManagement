import request from '@/utils/request'

export function AssociationList(data) {
  return request({
    url: '/Association/AssociationList',
    method: 'post',
    data
  })
}

export function UpdateAssociation(data) {
  return request({
    url: '/Association/UpdateAssociation',
    method: 'post',
    data
  })
}

export function DeleteAssociation(id) {
  return request({
    url: '/Association/DeleteAssociation',
    method: 'post',
    params: { id }
  })
}

export function deleteMemberById(id) {
  return request({
    url: '/Member/deleteMemberById',
    method: 'post',
    params: { id }
  })
}

export function upAADstatus(id) {
  return request({
    url: '/CommentManage/upAADstatus',
    method: 'post',
    params: { id }
  })
}

export function upCAMstatus(id) {
  return request({
    url: '/CommentManage/upCAMstatus',
    method: 'post',
    params: { id }
  })
}

export function updateMemberById(data) {
  return request({
    url: '/Member/updateMemberById',
    method: 'post',
    data
  })
}

export function SearchAssociationById(name) {
  return request({
    url: '/Association/SearchAssociationById',
    method: 'post',
    params: { name }
  })
}

export function MemberList(data) {
  return request({
    url: '/Member/MemberList',
    method: 'post',
    data
  })
}

export function CommentManageArticle(data) {
  return request({
    url: '/CommentManage/article',
    method: 'post',
    data
  })
}

export function CommentManageDus(data) {
  return request({
    url: '/CommentManage/dus',
    method: 'post',
    data
  })
}

export function QueryMember(data) {
  return request({
    url: '/Member/queryMember',
    method: 'post',
    data
  })
}
