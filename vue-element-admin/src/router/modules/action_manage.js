/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const action_manageRouter = {
  path: '/action_manage',
  component: Layout,
  redirect: '/action_manage/',
  name: 'Action_manage',
  meta: {
    title: 'action_manage',
    icon: 'action_manage'
  },
  children: [
    {
      path: 'notice',
      name: 'Notice',
      component: () => import('@/views/action_manage/notice/index'),
      meta: { title: 'notice' }
    },
    {
      path: 'sign',
      name: 'Sign',
      component: () => import('@/views/action_manage/sign/index'),
      meta: { title: 'sign' }
    }
  ]
}

export default action_manageRouter
