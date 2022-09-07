<template>
  <div style="margin:20px;">
    <div style="margin-top:20px;width:45%;margin-right:5%;float: right">
      <el-table
        :data="tableData"
        style="width: 100%"
        max-height="450">
        <el-table-column
          prop="name"
          label="账号"
          width="180">
        </el-table-column>
        <el-table-column
          prop="password"
          label="密码"
          width="180">
        </el-table-column>
        <el-table-column
          fixed="right"
          label="操作"
          width="100">
          <template slot-scope="scope">
            <el-button
              @click.native.prevent="deleteRow(scope.$index, tableData)"
              type="text"
              size="small">
              移除
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>

    <div style="margin-top:5%;width:45%;margin-right:5%;float: right">
    <el-form :label-position="labelPosition" label-width="80px"  :model="form">
      <el-form-item label="账号">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm()">提交</el-button>
        <el-button @click="resetForm()">重置</el-button>
      </el-form-item>
    </el-form>
    </div>

  </div>
</template>

<script>
import {deleteManage, feedbackList, selectManage} from "@/api/article";

export default {
  name: 'Index',
  data() {
    return {
      tableData: [


      ],
      labelPosition: 'right',
      form: {
        name: '',
        password: ''
      }
    };
  },
  created() {
    this.getList()
  },

  methods: {
    getList() {

      selectManage(this.form).then(response => {
        this.tableData = response.manage
      })
    },
    submitForm(form) {
      selectManage(this.form).then(response => {
        this.tableData = response.manage
        this.$notify({
          title: '成功',
          message: '插入成功',
          type: 'success',
          duration: 2000
        })
        this.form.password = null
        this.form.name = null
      })
    },
    resetForm(form) {
      this.form.password = null
      this.form.name = null
    },

    deleteRow(index, rows) {
      deleteManage(this.tableData[index].name).then(response => {
        this.$notify({
          title: '成功',
          message: '删除成功',
          type: 'success',
          duration: 2000
        })
        this.getList()
      })
    }
  },
}
</script>

<style scoped>

</style>
