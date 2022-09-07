<template>

  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px"  class="demo-ruleForm">
    <el-form-item :label="$t('action.thing')" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>

    <el-form-item label="活动时间" required prop="time">
      <el-col :span="11">
        <div class="block">
          <span class="demonstration"></span>
          <el-date-picker
            v-model="ruleForm.time"
            type="datetime"
            placeholder="选择日期时间">
          </el-date-picker>
        </div>
      </el-col>
    </el-form-item>

    <el-form-item :label="$t('action.timeLength')" prop="timeLength">
      <el-select v-model="ruleForm.timeLength" placeholder="请选择时长">
        <el-option label="1H" value="1"></el-option>
        <el-option label="1-2H" value="1-2"></el-option>
        <el-option label="2-4H" value="2-4"></el-option>
      </el-select>
    </el-form-item>

    <el-form-item label="社团" prop="ass">
      <el-select v-model="ruleForm.ass" placeholder="社团">
        <el-option v-for="item in ass" :key="item" :label="item" :value="item" />
      </el-select>
    </el-form-item>

    <el-form-item :label="$t('action.location')" prop="location">
      <el-input v-model="ruleForm.location"></el-input>
    </el-form-item>

    <el-form-item :label="$t('action.money')" prop="money">
      <el-input v-model="ruleForm.money"></el-input>
    </el-form-item>
    <el-form-item  :label="$t('action.personNum')" prop="sum">
      <el-radio-group v-model="ruleForm.sum">
        <el-radio label="0-10"></el-radio>
        <el-radio label="10-50"></el-radio>
        <el-radio label="50-100"></el-radio>
        <el-radio label="100-1000"></el-radio>
      </el-radio-group>
    </el-form-item>
    <el-form-item :label="$t('action.description')"  prop="des">
      <el-input type="textarea" v-model="ruleForm.des"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>

</template>
<script>
import { addAction } from '@/api/Action'
import {AssociationList} from "@/api/Association";
import {getHistoryAllApplyList} from "@/api/apply";
export default {
  data() {
    return {
      page:{
        startPage:1,
        pageSize:20,
      },
      pickerOptions: {
        shortcuts: [{
          text: '今天',
          onClick(picker) {
            picker.$emit('pick', new Date());
          }
        }, {
          text: '昨天',
          onClick(picker) {
            const date = new Date();
            date.setTime(date.getTime() - 3600 * 1000 * 24);
            picker.$emit('pick', date);
          }
        }, {
          text: '一周前',
          onClick(picker) {
            const date = new Date();
            date.setTime(date.getTime() - 3600 * 1000 * 24 * 7);
            picker.$emit('pick', date);
          }
        }]
      },
     ass:[],
      ruleForm: {

      },
      rules: {
        name: [
          { required: true, message: '请输入', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        location: [
          { required: true, message: '请输入', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        money: [
          { required: true, message: '请输入', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        ass: [
          { required: true, message: '请输入', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        timeLength: [
          { required: true, message: '请选择活动时长', trigger: 'change' }
        ],
        time: [
          { type: 'date', required: true, message: '请选择日期', trigger: 'change' }
        ],
        date2: [
          { type: 'date', required: true, message: '请选择时间', trigger: 'change' }
        ],
        type: [
          { type: 'array', required: true, message: '请至少选择一个活动性质', trigger: 'change' }
        ],
        sum: [
          { required: true, message: '请选择', trigger: 'change' }
        ],
        des: [
          { required: true, message: '请填写活动概述', trigger: 'blur' }
        ]
      }
    };
  },
  created() {
    this.getList()
  },
  methods: {
    getList() {
      this.listLoading = true
       getHistoryAllApplyList(this.page).then(response => {
        this.ass = response.ass

      })
    },


    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          addAction(this.ruleForm).then(() => {
            this.$notify({
              title: '成功',
              message: '提交成功',
              type: 'success',
              duration: 2000
            })
            this.$refs[formName].resetFields();
          })
        } else {

          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>

<style scoped>
.demo-ruleForm{
  width: 50%;
  margin-top: 2%;
}
</style>
