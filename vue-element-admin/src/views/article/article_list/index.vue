<template>
  <div class="app-container">
    <el-table v-loading="listLoading" :data="list" border fit highlight-current-row style="width: 100%">
      <el-table-column align="center" label="序号" width="50">
        <template slot-scope="{row}">
          <span>{{ row.id }}</span>
        </template>
      </el-table-column>

      <el-table-column width="180px" align="center" label="日期">
        <template slot-scope="{row}">
<!--          <span>{{ scope.row.timestamp | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>-->
          <span>{{ row.time}}</span>
        </template>
      </el-table-column>

      <el-table-column width="120px" align="center" label="所属社团">
        <template slot-scope="{row}">
          <span>{{ row.ass }}</span>
        </template>
      </el-table-column>

      <el-table-column width="80px" label="浏览量">
        <template slot-scope="{row}">
         <span>  {{row.view }}</span>
        </template>
      </el-table-column>

      <el-table-column  label="点赞量" width="80">
        <template slot-scope="{row}">
            <span> {{ row.star}}</span>
        </template>
      </el-table-column>

      <el-table-column min-width="300px" label="题目">
        <template slot-scope="{row}">
            <span>{{ row.title }}</span>
        </template>
      </el-table-column>


      <el-table-column :label="$t('table.status')"  width="100">
        <template slot-scope="{row}">
          <el-tag :type="row.status | statusFilter">
            {{ row.status }}
          </el-tag>
        </template>
      </el-table-column>

      <el-table-column align="center" label="操作" width="120">
        <template slot-scope="{row}">
            <el-button type="primary" size="small" @click="viewIdV(row)">
              预览
            </el-button>
          <el-button type="danger" size="small"  @click="deleteIdV(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="page.startPage" :limit.sync="page.pageSize" @pagination="getList" />

    <el-dialog :visible.sync="dialogPvVisible" title="预览" width="70%">
        <Tinymce v-if="dialogPvVisible" ref="editor" v-model="content" :height="400" />
    </el-dialog>
  </div>
</template>

<script>
import {deleteId, getArticleList, viewId} from '@/api/article'
import Pagination from '@/components/Pagination'
import ArticleDetail from "@/views/article/components/ArticleDetail";
import Tinymce from "@/components/Tinymce";

export default {
  name: 'ArticleList',
  components: {Tinymce, ArticleDetail, Pagination },
  filters: {
    statusFilter(status) {
      const statusMap = {
        已发布: 'success',
        已删除: 'info',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      page:{
        startPage:1,
        pageSize:20,
      },
      content:'',
      list: null,
      dialogPvVisible:false,
      total: 0,
      deleteId:undefined,
      viewId:undefined,
      listLoading: true,
      listQuery: {
        page: 1,
        limit: 20
      }
    }
  },
  created() {
    this.getList()
  },
  methods: {
    getList() {
      this.listLoading = true
      getArticleList(this.page).then(response => {
        this.list = response.data
        this.total = response.count
        this.listLoading = false
      })
    },
    viewIdV(row){

      this.viewId = row.id
      this.dialogPvVisible = true
      viewId(this.viewId).then(response => {
        //this.tinymce.get(this.content).setContent(response.content)
        //window.tinymce.get(this.content).setContent(response.content)
         this.content = response.content

      })
    },
    deleteIdV(row, index) {
      this.deleteId = row.id
      deleteId(this. deleteId).then(() => {
        this.$notify({
          title: '成功',
          message: '删除成功',
          type: 'success',
          duration: 2000
        })
      })
      this.getList()
    },
  }
}
</script>

<style scoped>
.edit-input {
  padding-right: 100px;
}
.cancel-btn {
  position: absolute;
  right: 15px;
  top: 10px;
}
</style>
