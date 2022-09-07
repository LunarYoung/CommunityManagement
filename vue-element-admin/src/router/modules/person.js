/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const personRouter = {
  path: '/person',
  component: Layout,
  redirect: '/person/',
  name: 'Apply',
  meta: {
    title: 'person',
    icon: 'people'
  },
  children: [
    {
      path: 'president',
      name: 'President',
      component: () => import('@/views/person/president/index'),
      meta: { title: 'president' }
    },
    {
      path: 'member',
      name: 'Member',
      component: () => import('@/views/person/member/index'),
      meta: { title: 'member' }
    }
  ]
}

export default personRouter
