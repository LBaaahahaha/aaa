import request from '@/utils/request'

// 查询组织属性列表
export function listAttribute(query) {
  return request({
    url: '/system/attribute/list',
    method: 'get',
    params: query
  })
}

// 查询组织属性详细
export function getAttribute(attrId) {
  return request({
    url: '/system/attribute/' + attrId,
    method: 'get'
  })
}

// 新增组织属性
export function addAttribute(data) {
  return request({
    url: '/system/attribute',
    method: 'post',
    data: data
  })
}

// 修改组织属性
export function updateAttribute(data) {
  return request({
    url: '/system/attribute',
    method: 'put',
    data: data
  })
}

// 删除组织属性
export function delAttribute(attrId) {
  return request({
    url: '/system/attribute/' + attrId,
    method: 'delete'
  })
}

// 导出组织属性
export function exportAttribute(query) {
  return request({
    url: '/system/attribute/export',
    method: 'get',
    params: query
  })
}