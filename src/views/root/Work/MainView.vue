<template>
	<div>
		<head>
			<meta charset="UTF-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<title>Document</title>
		</head>
		<body>
			<div id="main">
				<img src="./home-banner@2x.jpg" alt="./error.txt" height="225px" />
				<img src="./logo-white.svg" class="text" height="30px" />
				<!-- <button class="text4">
					<router-link to="/login">登录 </router-link>
				</button> -->
				<!-- Form -->
				<el-button type="button" @click="dialogFormVisible = true" class="text4">登录</el-button>

				<el-dialog title="登录界面" :visible.sync="dialogFormVisible">
					<el-form :model="numberValidateForm" ref="numberValidateForm" label-width="100px"
						class="demo-ruleForm">
						<el-form-item label="账号" prop="username" :rules="[
							{required: true, message: '账号不能为空', trigger: 'blur'},
							{min: 5 ,max: 15,message: '账号长度必须在5~15之间', trigger: 'blur'}
							]">
							<el-input v-model="numberValidateForm.username" autocomplete="off"></el-input>
						</el-form-item>
						<el-form-item label="密码" prop="password"
							:rules="[{required: true, message: '密码不能为空', trigger: 'blur'},]">
							<el-input v-model="numberValidateForm.password" autocomplete="off"
								type="password"></el-input>
						</el-form-item>
						<el-form-item>
							<el-button type="primary" @click="submitForm('numberValidateForm')">登录</el-button>
							<el-button @click="resetForm('numberValidateForm')">重置</el-button>
						</el-form-item>
					</el-form>
				</el-dialog>


				<!-- <button class="text5">注册</button> -->
				<el-button type="button" @click="dialogFormVisible2 = true" class="text5">注册</el-button>

				<el-dialog title="注册界面" :visible.sync="dialogFormVisible2" @close='handleCancle'>
					<el-form :model="numberValidateForm2" :rules="rules" ref="numberValidateForm2" label-width="100px"
						class="demo-ruleForm">
						<el-form-item label="账号" prop="username2">
							<el-input v-model="numberValidateForm2.username2" autocomplete="off"></el-input>
						</el-form-item>
						<el-form-item label="密码" prop="password2">
							<el-input v-model="numberValidateForm2.password2" autocomplete="off"
								type="password"></el-input>
						</el-form-item>
						<el-form-item label="确认密码" prop="realpassword">
							<el-input v-model="numberValidateForm2.realpassword" autocomplete="off"
								type="password"></el-input>
						</el-form-item>
						<el-form-item>
							<el-button type="primary" @click="submitForm('numberValidateForm2')">注册</el-button>
							<el-button @click="resetForm('numberValidateForm2')">重置</el-button>
						</el-form-item>
					</el-form>
				</el-dialog>
				<div class="text2"> <span style="font-size: 40px;">云端编程,浏览器里边学边练</span></div>
				<div class="text3"> <span style="font-size: 13px;">软件定义一切，网络连接时空，学习软件技术，创造未来世界。</span></div>
				<el-button type="button" @click="dialogFormVisible3 = true" class="button-position"><span
						class="col">马上学习</span></el-button>

				<el-dialog title="马上学习" :visible.sync="dialogFormVisible3">
					<el-form label-width="600px" class="demo-ruleForm">
						<el-form-item label="Cloud Studio 的业务场景相比于传统业务项目是极其复杂的，各个模块形态不同，vscode 内核、插件
						各类文件系统管理程序、动态的容器进程等多种形态的应用程序、十余种编程语言、数十种后台服务及针对各类程序的配套构建与配置工具。
                        久而久之，碎片化成为了 Cloud Studio 团队大开发人员最大的痛点。具体来讲，即依赖混乱、各模块版本难以统一、多工具碎片化">
							<!-- <el-input v-model="numberValidateForm2.username2" autocomplete="off"></el-input> -->
						</el-form-item>
					</el-form>
				</el-dialog>
				<!-- <br /> -->
				<div class="er">
					<img src="./img-lab@2x.png" class="er" />
					<span class=" gjweb1"> 高级Web编程实验室</span>
					<br />
					<span class="gjweb2"> 每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！</span>
					<br />
					<el-button type="button" @click="dialogFormVisible4 = true" class="san"><span
							class="col">了解详情</span></el-button>

					<el-dialog title="详情信息" :visible.sync="dialogFormVisible4">
						<el-form label-width="600px" class="demo-ruleForm">
							<el-form-item
								label="Cloud Studio 的业务场景相比于传统业务项目是极其复杂的，各个模块形态不同，vscode 内核、插件
							各类文件系统管理程序、动态的容器进程等多种形态的应用程序、十余种编程语言、数十种后台服务及针对各类程序的配套构建与配置工具。久而久之，碎片化成为了 Cloud Studio 团队大开发人员最大的痛点。具体来讲，即依赖混乱、各模块版本难以统一、多工具碎片化">
								<!-- <el-input v-model="numberValidateForm2.username2" autocomplete="off"></el-input> -->
							</el-form-item>
						</el-form>
					</el-dialog>
					<br />
				</div>
				<div>
					<img src="./img-screens@2x.png" width="640px" />
					<br>
					<span class="gjweb1"> 双屏学习</span>
					<br />
					<span class="gjweb2"> 双屏学习，小屏视频互动，大屏实际操作，学习无障碍。打开浏览器，即刻开始编程！</span>
					<br />
					<el-button type="button" @click="dialogFormVisible5 = true" class="si"><span
							class="col">了解详情</span></el-button>

					<el-dialog title="详情信息" :visible.sync="dialogFormVisible5">
						<el-form label-width="600px" class="demo-ruleForm">
							<el-form-item
								label="Cloud Studio 的业务场景相比于传统业务项目是极其复杂的，各个模块形态不同，vscode 内核、插件
							各类文件系统管理程序、动态的容器进程等多种形态的应用程序、十余种编程语言、数十种后台服务及针对各类程序的配套构建与配置工具。久而久之，碎片化成为了 Cloud Studio 团队大开发人员最大的痛点。具体来讲，即依赖混乱、各模块版本难以统一、多工具碎片化">
								<!-- <el-input v-model="numberValidateForm2.username2" autocomplete="off"></el-input> -->
							</el-form-item>
						</el-form>
					</el-dialog>
				</div>
				<div class="body3">
					<div class="d1">课程特色</div>
					<div class="d2">
						<div class="d21">丰富的教学服务</div>
						<div>特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。</div>
						<a href="">马上学习 ></a>
					</div>
					<div class="d3">
						<div class="d31">多元的学习方式</div>
						<div>知识提炼、答疑解惑、实时互动、开发有特色的教学服务方式。</div>
						<a href="">马上学习 ></a>
					</div>
					<div class="d4">
						<div class="d41">高品质的学习体验</div>
						<div>多屏合一，随时学习，随时在线，学习记录一目了然，知识充电不再受限。</div>
						<a href="">马上学习 ></a>
					</div>
				</div>
				<br />
				<div class="bottom">@2021 前沿科技Artech All rights reserved</div>
			</div>
		</body>
	</div>
</template>
<style>
	#main {
		/* width: 65%; */
		margin-left: 26%;
	}

	.text {
		position: absolute;
		top: 3%;
		left: 33%;
		transform: translate(-50%, -50%);
	}

	.text2 {
		position: absolute;
		top: 10%;
		left: 46%;
		transform: translate(-50%, -50%);
		color: aliceblue;
	}

	.text3 {
		position: absolute;
		top: 15%;
		left: 46%;
		transform: translate(-50%, -50%);
		color: aliceblue;
	}

	.text4 {
		position: absolute;
		top: 3%;
		left: 57%;
		line-height: 1px;
		font-family: 华文新魏;
		font-size: 17px;
		transform: translate(-50%, -50%);
		color: rgb(66, 140, 253);
	}

	.text5 {
		position: absolute;
		top: 3%;
		left: 62%;
		line-height: 1px;
		font-family: 华文新魏;
		font-size: 17px;
		transform: translate(-50%, -50%);
		color: rgb(66, 140, 253)
	}

	.button-position {
		border-radius: 10px;
		position: absolute;
		top: 18%;
		left: 41%;
		font-family: 华文新魏;
		font-size: 25px;
		line-height: 20px;
		background-color: #ffffff;
	}

	.col {
		color: rgb(66, 140, 253);
	}

	.er {
		background-color: #f4f4f4;
		width: 640px;
	}

	.san {
		margin-left: 5%;
		width: 580px;
		line-height: 1px;
		background-color: #f4f4f4;
	}

	.si {
		margin-left: 5%;
		width: 580px;
		background-color: #ffffff;
		line-height: 1px;
		border-radius: 8px;
	}

	.gjweb1 {
		white-space: pre;
		font-size: 20px;
		font-family: 华文新魏;
	}

	.gjweb2 {
		white-space: pre;
		font-size: 13px;
		font-family: 华文新魏;
	}

	.body3 {
		display: flex;
		flex-wrap: wrap;
		width: 640px;
		height: 300px;
	}

	div.d1 {
		height: 30px;
		width: 100%;
		font-weight: bold;
		font-size: 15px;
		margin: 20px 50px;
		border-bottom: 1px solid rgb(108, 117, 125);
	}

	div.d2 {
		flex: 1;
		height: 150px;
		margin-left: 50px;
		background-image: url("./cup-fill.svg");
		background-repeat: no-repeat;
		background-size: 30px 30px;
		background-position: 0px 15px;
	}

	div.d21 {
		margin-top: 60px;
		font-size: 20px;
	}

	div.d3 {
		flex: 1;
		height: 220px;
		margin-left: 50px;
		background-image: url("./envelope-heart-fill.svg");
		background-repeat: no-repeat;
		background-size: 40px 40px;
		background-position: 0px 15px;
	}

	div.d31 {
		margin-top: 60px;
		font-size: 20px;
	}

	div.d4 {
		flex: 1;
		height: 220px;
		margin-left: 50px;
		background-image: url("./sun-fill.svg");
		background-repeat: no-repeat;
		background-size: 40px 40px;
		background-position: 0px 15px;
	}

	div.d41 {
		margin-top: 60px;
		font-size: 30px;
	}

	div.bottom {
		display: flex;
		width: 640px;
		height: 100px;
		justify-content: space-around;
		background-color: rgb(244, 244, 244);
		line-height: 100px;
		text-align: center;
	}
</style>
<script>
	import axios from 'axios';
	export default {
		data() {
			var validatePass = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请输入密码'));
				} else {
					callback();
				}
			};
			var validatePass2 = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请再次输入密码'));
				} else if (value !== this.numberValidateForm2.password2) {
					callback(new Error('两次输入密码不一致!'));
				} else {
					callback();
				}
			};
			return {
				dialogFormVisible: false,
				dialogFormVisible2: false,
				dialogFormVisible3: false,
				dialogFormVisible4: false,
				dialogFormVisible5: false,
				numberValidateForm: {
					username: '',
					password: ''
				},
				numberValidateForm2: {
					username2: '',
					password2: '',
					realpassword: ''
				},
				data: [],
				rules: {
					username2: [{
							required: true,
							message: '账号不能为空',
							trigger: 'blur'
						},
						{
							min: 5,
							max: 15,
							message: '账号长度必须在5~15之间',
							trigger: 'blur'
						}
					],
					password2: [{
							required: true,
							message: '密码不能为空',
							trigger: 'blur'
						},
						{
							min: 5,
							max: 15,
							message: '密码长度必须在5~15之间',
							trigger: 'blur'
						},
						{
							validator: validatePass,
							trigger: 'blur'
						}
					],
					realpassword: [{
							required: true,
							message: '密码不能为空',
							trigger: 'blur'
						},
						{
							min: 5,
							max: 15,
							message: '密码长度必须在5~15之间',
							trigger: 'blur'
						},
						{
							validator: validatePass2,
							trigger: 'blur',
							required: true
						}
					]

				}
			};
		},
		methods: {
			submitForm(formName) {
				if (formName == 'numberValidateForm') {
					let formData2 = new FormData();
					formData2.append('key1', this.numberValidateForm.username);
					formData2.append('key2', this.numberValidateForm.password);
					const val = 'http://127.0.0.1:8090/login';
					axios.post(val, formData2, {
						headers: {
							'Content-Type': 'multipart/form-data'
						}
					}).then((result) => {
						if(result.data.data[0].state==1)
						alert("登陆成功");
						else alert("登录失败")
					});
				} else {
					let formData = new FormData();
					formData.append('key1', this.numberValidateForm2.username2);
					formData.append('key2', this.numberValidateForm2.password2);
					formData.append('key3',this.numberValidateForm2.realpassword);
					const val = 'http://127.0.0.1:8090/regist';
					axios.post(val, formData, {
						headers: {
							'Content-Type': 'multipart/form-data'
						}
					}).then((result) => {
						let num=result.data.data;
						if(num==1)
						alert("注册成功");
						else if(num==0) alert("用户名已存在，请重新输入");
						else if(num==2) alert("账号或密码不能为空");
						else if(num==3) alert("账号或密码过短");
						else if(num==4) alert("账号或密码过长");
						else alert("两次输入的密码不一致");
						console.log(result);
					});
				}
			},
			resetForm(formName) {
				this.$refs[formName].resetFields();
			},
			handleCancle() {
				this.$refs.form.resetFields()
				this.dialogVisible = false
			},
		}
	};
</script>