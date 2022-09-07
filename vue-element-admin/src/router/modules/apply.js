/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const applyRouter = {
  path: '/apply',
  component: Layout,
  redirect: '/apply/interview/',
  name: 'Apply',
  meta: {
    title: 'apply',
    icon: 'apply_menu'
  },
  children: [
    {
      path: 'interview',
      component: () => import('@/views/apply/interview/index'), // Parent router-view
      name: 'Interview',
      meta: { title: 'interview' },
      redirect: '/apply/interview/first_interview',
      children: [
        {
          path: 'first_interview',
          component: () => import('@/views/apply/interview/first_interview'),
          name: 'First_interview',
          meta: { title: 'first_interview' }
        }
        // {
        //   path: 'second_interview',
        //   component: () => import('@/views/apply/interview/second_interview'),
        //   name: 'Second_interview',
        //   meta: { title: 'second_interview' }
        // }
      ]
    },
    {
      path: 'history',
      name: 'History',
      component: () => import('@/views/apply/history/index'),
      meta: { title: 'history' }
    }
  ]
}

export default applyRouter
