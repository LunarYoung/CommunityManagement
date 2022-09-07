/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const actionRouter = {
  path: '/action',
  component: Layout,
  redirect: '/action/',
  name: 'Action',
  meta: {
    title: 'action',
    icon: 'action'
  },
  children: [

    {
      path: 'apply_action',
      name: 'Apply_action',
      component: () => import('@/views/action/apply_action/index'),
      meta: { title: 'apply_action' }
    },
    // {
    //   path: 'apply_venue',
    //   name: 'Apply_venue',
    //   component: () => import('@/views/action/apply_venue/index'),
    //   meta: { title: 'apply_venue' }
    // },
    // {
    //   path: 'public_event_release',
    //   name: 'Public_event_release',
    //   component: () => import('@/views/action/public_event_release/index'),
    //   meta: { title: 'public_event_release' }
    // },
    {
      path: 'publicRegistrationManagement',
      name: 'PublicRegistrationManagement',
      component: () => import('@/views/action/publicRegistrationManagement/index'),
      meta: { title: 'publicRegistrationManagement' }
    }
  ]
}

export default actionRouter
