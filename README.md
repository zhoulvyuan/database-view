# 使用手册
## 修改config/application.yml中的配置
    数据库配置根据实际需要生成的数据库系统调整
	file.export.path：数据库描述文件输出目录
    file.export.version: 文件版本
    file.export.description: 文件名称描述，包含中文时需要转义为Unicode码
    file.export.file-type: 文件类型，支持htm,word,md三种类型，默认html

## 双击可执行文件
database-view.exe

## 结果查看
程序执行完成后可在默认output路径中查看数据库文件，若file.export.path有做调整，则在调整的目录中查看文件

