/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const commentRouter = {
  path: '/comment',
  component: Layout,
  redirect: '/comment/',
  name: 'Comment',
  meta: {
    title: 'comment',
    icon: 'comment'
  },
  children: [

    {
      path: 'article_comments',
      name: 'Article_comments',
      component: () => import('@/views/comment/article_comments/index'),
      meta: { title: 'article_comments' }
    },
    {
      path: 'discussion_comments',
      name: 'Discussion_comments',
      component: () => import('@/views/comment/discussion_comments/index'),
      meta: { title: 'discussion_comments' }
    }
  ]
}

export default commentRouter
