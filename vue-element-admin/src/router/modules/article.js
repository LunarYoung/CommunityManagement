/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const articleRouter = {
  path: '/article',
  component: Layout,
  redirect: '/article/vote/',
  name: 'Article',
  meta: {
    title: 'article',
    icon: 'documentation'
  },
  children: [
    {
      path: 'deliver',
      name: 'Deliver',
      component: () => import('@/views/article/deliver/index'),
      meta: { title: 'deliver' }
    },
    {
      path: 'article_list',
      name: 'Article_list',
      component: () => import('@/views/article/article_list/index'),
      meta: { title: 'article_list' }
    }

    // {
    //   path: 'vote',
    //   component: () => import('@/views/article/vote'),
    //   name: 'Vote',
    //   meta: { title: 'vote' },
    //   redirect: '/vote/voteCreate',
    //   children: [
    //     {
    //       path: 'voteCreate',
    //       component: () => import('@/views/article/vote/voteCreate'),
    //       name: 'VoteCreate',
    //       meta: { title: 'voteCreate' }
    //     },
    //     {
    //       path: 'voteHistory',
    //       component: () => import('@/views/article/vote/voteHistory'),
    //       name: 'VoteHistory',
    //       meta: { title: 'voteHistory' }
    //     }
    //   ]
    // }
  ]
}

export default articleRouter
