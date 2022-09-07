/**
 * Created by PanJiaChen on 16/11/18.
 */

/**
 * Parse the time to string
 * @returns {string | null}
 * @param timestamp
 */
export function myParseTime(timestamp) {
  // eslint-disable-next-line no-undef
  const a = new Date(timestamp).getTime()
  const date = new Date(a)
  const Y = date.getFullYear() + '-'
  const M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-'
  const D = (date.getDate() < 10 ? '0' + date.getDate() : date.getDate()) + '  '
  const h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':'
  const m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes())
  // const s = date.getSeconds(); // 秒
  const dateString = Y + M + D + h + m
  // console.log('dateString', dateString); // > dateString 2021-07-06 14:23
  return dateString
}

