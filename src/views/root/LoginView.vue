<template>
	<el-form ref="loginForm" :model="loginForm" label-width="80px">
		<el-form-item label="用户名">
			<el-input v-model="loginForm.username" autocomplete="off"></el-input>
		</el-form-item>
		<el-form-item label="密码">
			<el-input type="password" v-model="loginForm.password" autocomplete="off"></el-input>
		</el-form-item>
		<el-form-item>
			<el-button type="primary" @click="submitForm('loginForm')">登录</el-button>
			<el-button @click="resetForm('loginForm')">重置</el-button>
		</el-form-item>
	</el-form>
</template>

<script>
	export default {
		data() {
			return {
				loginForm: {
					username: '',
					password: ''
				}
			}
		},
		methods: {
			submitForm(formName) {
				this.$refs[formName].validate((valid) => {
					if (valid) {
						// alert('登录成功！');
						this.loginForm.username = '';
						// 这里应该是登录逻辑
					} else {
						alert('请输入正确的用户名和密码！');
						return false;
					}
				});
			},
			resetForm() {
				this.loginForm.username = '';
				this.loginForm.password = '';
			}
		}
	}
</script>

<style>
	.el-form {
		width: 240px;
		margin: 100px auto;
	}
</style>