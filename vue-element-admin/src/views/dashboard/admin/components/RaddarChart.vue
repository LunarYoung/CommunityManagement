<template>
  <div :class="className" :style="{height:height,width:width}" />
</template>

<script>
import echarts from 'echarts'
require('echarts/theme/macarons') // echarts theme
import resize from './mixins/resize'
import {Dashboard, grade} from "@/api/Da";

const animationDuration = 3000

export default {
  mixins: [resize],
  props: {
    className: {
      type: String,
      default: 'chart'
    },
    width: {
      type: String,
      default: '100%'
    },
    height: {
      type: String,
      default: '300px'
    }
  },
  data() {
    return {
      chart: null,


    }
  },
  created() {
    this.getList()
  },
  // mounted() {
  //   this.$nextTick(() => {
  //     this.initChart()
  //   })
  // },
  beforeDestroy() {
    if (!this.chart) {
      return
    }
    this.chart.dispose()
    this.chart = null
  },
  methods: {
    getList() {
      grade().then(response => {
        this.chart = echarts.init(this.$el, 'macarons')
        this.chart.setOption({
          title: {
            text: '年级比'
          },
          tooltip: {
            trigger: 'axis',
            axisPointer: { // 坐标轴指示器，坐标轴触发有效
              type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
            }
          },
          radar: {
            radius: '66%',
            center: ['50%', '42%'],
            splitNumber: 8,
            splitArea: {
              areaStyle: {
                color: 'rgba(127,95,132,.3)',
                opacity: 1,
                shadowBlur: 45,
                shadowColor: 'rgba(0,0,0,.5)',
                shadowOffsetX: 0,
                shadowOffsetY: 15
              }
            },
            indicator: [
              { name: '一年级', max: 10 },
              { name: '二年级', max: 10 },
              { name: '三年级', max: 10 },
              { name: '四年级', max: 10 }
              // { name: 'Development', max: 20000 },
              // { name: 'Marketing', max: 20000 }
            ]
          },
          legend: {
            left: 'center',
            bottom: '10',
            data: ['人数', 'Expected Spending', 'Actual Spending']
          },
          series: [{
            type: 'radar',
            symbolSize: 0,
            areaStyle: {
              normal: {
                shadowBlur: 13,
                shadowColor: 'rgba(0,0,0,.2)',
                shadowOffsetX: 0,
                shadowOffsetY: 10,
                opacity: 1
              }
            },
            data: [
              {
                value: response.list,
                name: '人数'
              }
              // {
              //   value: [4000, 9000, 15000, 15000, 13000, 11000],
              //   name: 'Expected Spending'
              // },
              // {
              //   value: [5500, 11000, 12000, 15000, 12000, 12000],
              //   name: 'Actual Spending'
              // }
            ],
            animationDuration: animationDuration
          }]
        })
      })
    },
    initChart() {
      this.chart = echarts.init(this.$el, 'macarons')
      this.chart.setOption({
        title: {
          text: '年级比'
        },
        tooltip: {
          trigger: 'axis',
          axisPointer: { // 坐标轴指示器，坐标轴触发有效
            type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
          }
        },
        radar: {
          radius: '66%',
          center: ['50%', '42%'],
          splitNumber: 8,
          splitArea: {
            areaStyle: {
              color: 'rgba(127,95,132,.3)',
              opacity: 1,
              shadowBlur: 45,
              shadowColor: 'rgba(0,0,0,.5)',
              shadowOffsetX: 0,
              shadowOffsetY: 15
            }
          },
          indicator: [
            { name: '一年级', max: 500 },
            { name: '二年级', max: 500 },
            { name: '三年级', max: 500 },
            { name: '四年级', max: 500 }
            // { name: 'Development', max: 20000 },
            // { name: 'Marketing', max: 20000 }
          ]
        },
        legend: {
          left: 'center',
          bottom: '10',
          data: ['人数', 'Expected Spending', 'Actual Spending']
        },
        series: [{
          type: 'radar',
          symbolSize: 0,
          areaStyle: {
            normal: {
              shadowBlur: 13,
              shadowColor: 'rgba(0,0,0,.2)',
              shadowOffsetX: 0,
              shadowOffsetY: 10,
              opacity: 1
            }
          },
          data: [
            {
              value: this.value,
              name: '人数'
            }
            // {
            //   value: [4000, 9000, 15000, 15000, 13000, 11000],
            //   name: 'Expected Spending'
            // },
            // {
            //   value: [5500, 11000, 12000, 15000, 12000, 12000],
            //   name: 'Actual Spending'
            // }
          ],
          animationDuration: animationDuration
        }]
      })
    }
  }
}
</script>
