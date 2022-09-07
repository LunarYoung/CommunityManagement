
<template>
  <div>
    <el-divider content-position="left">小程序页面设置</el-divider>
  <el-form :model="form" :rules="rules" ref="ruleForm" label-width="100px"  class="Form">

    <el-form-item label="图片地址一" prop="pass">
      <el-input v-model="form.img1" ></el-input>
    </el-form-item>
    <el-form-item label="图片地址二" prop="checkPass">
      <el-input  v-model="form.img2" ></el-input>
    </el-form-item>
    <el-form-item label="图片地址三" prop="age">
      <el-input v-model.number="form.img3"></el-input>
    </el-form-item>

    <el-form-item label="声明内容" prop="status">
      <el-input type="textarea" v-model="form.status" :rows="8" ></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">保存</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
  </div>
</template>

<script>
import { queryApplets,updateApplets} from '@/api/article'
export default {
  data() {
    return {
      form: {
        img1:'',
        img2:'',
        img3:'',
        status: ''
      },
      rules: {
        status: [
          { required: true, message: '请填写', trigger: 'blur' }
        ]
      }
    };
  },
  created() {
    this.getApplets()
  },
  methods: {
    getApplets(){
      {
        this.listLoading = true
        queryApplets().then(response => {
          this.form = response.data

          setTimeout(() => {
            this.listLoading = false
          }, 1 * 1000)
        })
      }
    },
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          updateApplets(this.form).then(response =>{
            if(response.code === 200){
              this.$notify({
                title: '保存成功',
                type: 'success',
                duration: 2000
              })
            }
          })

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
.Form{
  height: 80%;
  width: 80%;
  margin-top: 2%;
  margin-left: 5%;
}

</style>
