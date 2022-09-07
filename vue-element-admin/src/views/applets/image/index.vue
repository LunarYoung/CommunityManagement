<template>
  <div  >
    <el-upload
      class="plus"
      action="https://jsonplaceholder.typicode.com/posts/"
      list-type="picture-card"
      :limit="1"
      :on-exceed="handleExceed"
      :before-upload="beforeUpload"
      :on-preview="handlePictureCardPreview"
      :on-remove="handleRemove">
      <i class="el-icon-plus"></i>
    </el-upload>
    <el-upload
      class="plus"
      action="https://jsonplaceholder.typicode.com/posts/"
      list-type="picture-card"
      :limit="1"
      :on-exceed="handleExceed"
      :before-upload="beforeUpload"
      :on-preview="handlePictureCardPreview"
      :on-remove="handleRemove">
      <i class="el-icon-plus"></i>
    </el-upload>
    <el-upload
      class="plus"
      action="https://jsonplaceholder.typicode.com/posts/"
      list-type="picture-card"
      :limit="1"
      :on-exceed="handleExceed"
      :before-upload="beforeUpload"
      :on-preview="handlePictureCardPreview"
      :on-remove="handleRemove">
      <i class="el-icon-plus"></i>
    </el-upload>
    <el-dialog :visible.sync="dialogVisible">
      <img width="100%"  :src="dialogImageUrl" alt="">
    </el-dialog>
    <el-button type="primary" class="btn">保存</el-button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogImageUrl: '',
      dialogVisible: false
    };
  },
  methods: {
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePictureCardPreview(file) {
      this.dialogImageUrl = file.url;
      this.dialogVisible = true;
    },
    beforeUpload(file) {
      const isJPG = file.type === 'image/jpeg';
      const isLt2M = file.size / 1024 / 1024 < 2;

      if (!isJPG) {
        this.$message.error('上传图片只能是 JPG 格式!');
      }
      if (!isLt2M) {
        this.$message.error('上传图片大小不能超过 2MB!');
      }
      return isJPG && isLt2M;
    },
    handleExceed(files, fileList) {
      this.$message.warning(`当前限制选择 3 个文件，本次选择了 ${files.length} 个文件，共选择了 ${ fileList.length} 个文件`);
    },
  }
}
</script>
<style >

.plus{
  margin-left: 5%;
  margin-top: 2%;

}

.el-upload--picture-card{
  height: 200px;
  width: 300px;
}
.el-upload-list--picture-card .el-upload-list__item{
  height: 200px!important;
  width: 300px!important;
}
.el-upload-list__item-thumbnail{
  height: 200px!important;
  width: 300px!important;

}


.btn{
  margin-left: 40%;
  margin-top: 1%;
  width: 20%;
}

</style>
