import Layout from '@/layout'
const associationRouter =
{
  path: '/association',
  component: Layout,
  redirect: '/association/',
  name: 'Association',
  meta: {
    title: 'association',
    icon: 'association'
  },

  children: [
    {
      path: 'association',
      component: () => import('@/views/association/association/index'),
      name: 'Association',
      meta: { title: 'association_manage' }
    },
    {
      path: 'activity_approval',
      component: () => import('@/views/association/activity_approval/index'),
      name: 'Activity_approval',
      meta: { title: 'activity_approval' }
    }
    // {
    //   path: 'venue_approval',
    //   component: () => import('@/views/association/venue_approval/index'),
    //   name: 'Venue_approval',
    //   meta: { title: 'venue_approval' }
    // },
    // {
    //   path: 'cost_approval',
    //   component: () => import('@/views/association/cost_approval/index'),
    //   name: 'Cost_approval',
    //   meta: { title: 'cost_approval' }
    // }
    //
  ]

}
export default associationRouter
