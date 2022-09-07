<template>

  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px"  class="demo-ruleForm">
    <el-form-item :label="$t('action.thing')" prop="item">
      <el-input v-model="ruleForm.item"></el-input>
    </el-form-item>

    <el-form-item label="通知时间" required prop="time">
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

    <el-form-item label="是否签到" prop="sign">
      <el-select v-model="ruleForm.sign" placeholder="签到">
        <el-option label="是" value="是"></el-option>
        <el-option label="否" value="否"></el-option>

      </el-select>
    </el-form-item>

    <el-form-item label="社团" prop="ass">
      <el-select v-model="ruleForm.ass" placeholder="社团">
        <el-option v-for="item in ass" :key="item" :label="item" :value="item" />
      </el-select>
    </el-form-item>

<!--    <el-form-item :label="$t('action.location')" prop="location">-->
<!--      <el-input v-model="ruleForm.location"></el-input>-->
<!--    </el-form-item>-->

<!--    <el-form-item :label="$t('action.money')" prop="money">-->
<!--      <el-input v-model="ruleForm.money"></el-input>-->
<!--    </el-form-item>-->



    <!--    <el-form-item label="即时配送" prop="delivery">-->
    <!--      <el-switch v-model="ruleForm.delivery"></el-switch>-->
    <!--    </el-form-item>-->
    <!--    <el-form-item  :label="$t('action.personNum')" prop="type">-->
    <!--      <el-checkbox-group v-model="ruleForm.type">-->
    <!--        <el-checkbox label="美食/餐厅线上活动" name="type"></el-checkbox>-->
    <!--        <el-checkbox label="地推活动" name="type"></el-checkbox>-->
    <!--        <el-checkbox label="线下主题活动" name="type"></el-checkbox>-->
    <!--        <el-checkbox label="单纯品牌曝光" name="type"></el-checkbox>-->
    <!--      </el-checkbox-group>-->
    <!--    </el-form-item>-->
<!--    <el-form-item  :label="$t('action.personNum')" prop="sum">-->
<!--      <el-radio-group v-model="ruleForm.sum">-->
<!--        <el-radio label="0-10"></el-radio>-->
<!--        <el-radio label="10-50"></el-radio>-->
<!--        <el-radio label="50-100"></el-radio>-->
<!--        <el-radio label="100-1000"></el-radio>-->
<!--      </el-radio-group>-->
<!--    </el-form-item>-->
    <el-form-item :label="$t('action.description')" style="height: 100px"  prop="des">
      <el-input   :rows="4" type="textarea" v-model="ruleForm.des"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>

</template>
<script>
import {addAction, addNotice} from '@/api/Action'
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
        item: [
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
        sign: [
          { required: true, message: '请选择', trigger: 'change' }
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
          addNotice(this.ruleForm).then(() => {
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
  width: 60%;
  margin-top: 2%;
}
</style>
