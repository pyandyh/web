import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [{
		path: '/login',
		name: 'login',
		component: () => import( /* webpackChunkName: "about" */ '../views/root/LoginView.vue')
	},
	{
		path: '/',
		redirect: '/main'
	},
	{
		path: '/main',
		name: 'main',
		component: () => import( /* webpackChunkName: "about" */ '../views/root/Work/MainView.vue')
	}
]

const router = new VueRouter({
	routes
})

export default router