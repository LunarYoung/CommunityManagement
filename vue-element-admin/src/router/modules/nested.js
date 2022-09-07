/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const nestedRouter = {
  path: '/nested',
  component: Layout,
  redirect: '/nested/interview/interview-1',
  name: 'Nested',
  meta: {
    title: 'nested',
    icon: 'nested'
  },
  children: [
    {
      path: 'menu1',
      component: () => import('@/views/nested/menu1/index'), // Parent router-view
      name: 'Menu1',
      meta: { title: 'menu1' },
      redirect: '/nested/interview/interview-1',
      children: [
        {
          path: 'menu1-1',
          component: () => import('@/views/nested/menu1/menu1-1'),
          name: 'Menu1-1',
          meta: { title: 'menu1-1' }
        },
        {
          path: 'menu1-2',
          component: () => import('@/views/nested/menu1/menu1-2'),
          name: 'Menu1-2',
          redirect: '/nested/interview/interview-2/interview-2-1',
          meta: { title: 'menu1-2' }
          // children: [
          //   {
          //     path: 'interview-2-1',
          //     component: () => import('@/views/nested/interview/interview-2/interview-2-1'),
          //     name: 'Menu1-2-1',
          //     meta: { title: 'interview-2-1' }
          //   },
          //   {
          //     path: 'interview-2-2',
          //     component: () => import('@/views/nested/interview/interview-2/interview-2-2'),
          //     name: 'Menu1-2-2',
          //     meta: { title: 'interview-2-2' }
          //   }
          // ]
        }
        // {
        //   path: 'interview-3',
        //   component: () => import('@/views/nested/interview/interview-3'),
        //   name: 'Menu1-3',
        //   meta: { title: 'interview-3' }
        // }
      ]
    },
    {
      path: 'menu2',
      name: 'Menu2',
      component: () => import('@/views/nested/menu2/index'),
      meta: { title: 'menu2' }
    }
  ]
}

export default nestedRouter
