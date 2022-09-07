<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item :label="$t('vote.voteName')" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
    <el-form-item :label="$t('vote.choose')" prop="region">
      <el-select v-model="ruleForm.region" placeholder="请选择活动区域">
        <el-option  :label="$t('vote.choose1')" value="shanghai"></el-option>
        <el-option  :label="$t('vote.choose2')" value="beijing"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item  :label="$t('vote.time')" required>
      <el-col :span="11">
        <el-form-item prop="date1">
          <el-date-picker type="date" placeholder="选择日期" v-model="ruleForm.date1" style="width: 100%;"></el-date-picker>
        </el-form-item>
      </el-col>
      <el-col class="line" :span="2">-</el-col>
      <el-col :span="11">
        <el-form-item prop="date2">
          <el-time-picker placeholder="选择时间" v-model="ruleForm.date2" style="width: 100%;"></el-time-picker>
        </el-form-item>
      </el-col>
    </el-form-item>
<!--    <el-form-item label="即时配送" prop="delivery">-->
<!--      <el-switch v-model="ruleForm.delivery"></el-switch>-->
<!--    </el-form-item>-->
    <el-form-item :label="$t('vote.option')" >
      <el-checkbox-group v-model="ruleForm.type">
<!--        <el-checkbox :label="$t('vote.option1')" name="type"></el-checkbox>-->
<!--        <el-checkbox :label="$t('vote.option2')" name="type"></el-checkbox>-->
<!--        <el-checkbox :label="$t('vote.option3')" name="type"></el-checkbox>-->
        <el-input
          type="text"
          :placeholder="$t('vote.tip')"
          v-model="ruleForm.text"
          maxlength="10"
          show-word-limit
        >
        </el-input>
        <el-input
          prop="text1"
          type="text"
          :placeholder="$t('vote.tip')"
          v-model="ruleForm.text1"
          maxlength="10"
          show-word-limit
        >
        </el-input>
        <el-input
          type="text"
          :placeholder="$t('vote.tip')"
          v-model="ruleForm.text2"
          maxlength="10"
          show-word-limit
        >
        </el-input>
        <el-input
          type="text"
          :placeholder="$t('vote.tip')"
          v-model="ruleForm.text3"
          maxlength="10"
          show-word-limit
        >
        </el-input>
      </el-checkbox-group>
    </el-form-item>
<!--    <el-form-item label="特殊资源" prop="resource">-->
<!--      <el-radio-group v-model="ruleForm.resource">-->
<!--        <el-radio label="线上品牌商赞助"></el-radio>-->
<!--        <el-radio label="线下场地免费"></el-radio>-->
<!--      </el-radio-group>-->
<!--    </el-form-item>-->
    <el-form-item :label="$t('vote.describe')" prop="desc">
      <el-input type="textarea" v-model="ruleForm.desc"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>



</template>

<script>
export default {
  data() {
    return {
      ruleForm: {
        name: '',
        region: '',
        text: '',
        text1: '',
        text2: '',
        text3: '',
        date1: '',
        date2: '',
        delivery: false,
        type: [],
        resource: '',
        desc: ''
      },
      rules: {
        name: [
          { required: true, message: '请输入投票标题', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        region: [
          { required: true, message: '请选择', trigger: 'change' }
        ],
        date1: [
          { type: 'date', required: true, message: '请选择日期', trigger: 'change' }
        ],
        date2: [
          { type: 'date', required: true, message: '请选择时间', trigger: 'change' }
        ],
        text1: [
          { type: 'array', required: true, message: '请至少选择至少两个选项', trigger: 'change' }
        ],
        resource: [
          { required: true, message: '请选择活动资源', trigger: 'change' }
        ],
        desc: [
          { required: true, message: '请填写概述', trigger: 'blur' }
        ]
      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert('submit!');
        } else {
          console.log('error submit!!');
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

</style>
