/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const appletsRouter = {
  path: '/applets',
  component: Layout,
  redirect: '/applets/',
  name: 'Applets',
  meta: {
    title: 'applets',
    icon: 'applets',
    perms: ['normal']
  },
  children: [
    // {
    //   path: 'image',
    //   name: 'Image',
    //   component: () => import('@/views/applets/image/index'),
    //   meta: { title: 'image' }
    // },
    {
      path: 'status',
      name: 'Status',
      component: () => import('@/views/applets/status/index'),
      meta: { title: 'status', perms: ['normal'] }
    }
  ]
}

export default appletsRouter
