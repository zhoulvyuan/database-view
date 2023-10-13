package com.zwj.database.view;

import com.zwj.database.view.handle.DatabaseViewHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
@ComponentScan("com.zwj.database.view.*")
public class DatabaseViewApplication {

	private static DatabaseViewHandle databaseViewHandle;

	@Autowired
	public void setDatabaseViewHandle(DatabaseViewHandle databaseViewHandle) {
		DatabaseViewApplication.databaseViewHandle = databaseViewHandle;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatabaseViewApplication.class, args);
		databaseViewHandle.handle();
		// 弹出一个带有选项的确认框
		int result = JOptionPane.showConfirmDialog(null, "数据库描述文件生成成功！", "确认", JOptionPane.DEFAULT_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			context.close();
		} else {
			context.close();
		}

	}

}
