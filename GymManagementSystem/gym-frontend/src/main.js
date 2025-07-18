import Vue from 'vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App.vue'
import router from './router'
import store from './store'
import * as echarts from 'echarts'
Vue.prototype.$echarts = echarts;

import '@/assets/css/global.css';

Vue.config.productionTip = false
Vue.use(ElementUI);
new Vue({
  router,
  store,
  render: h => h(App),

}).$mount('#app')




