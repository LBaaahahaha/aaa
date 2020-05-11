import request from '@/utils/request'

// 查询历史组织列表
export function listOlddept(query) {
  return request({
    url: '/system/olddept/list',
    method: 'get',
    params: query
  })
}

// 查询历史组织详细
export function getOlddept(deptId) {
  return request({
    url: '/system/olddept/' + deptId,
    method: 'get'
  })
}




// 导出历史组织
export function exportOlddept(query) {
  return request({
    url: '/system/olddept/export',
    method: 'get',
    params: query
  })
}