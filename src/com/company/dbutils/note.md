ManageSystem的结构
```
SQL> DESC ManageSystem
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID					   NOT NULL NUMBER(10)
 USERNAME			   NOT NULL VARCHAR2(20)
 PASSWORD					    VARCHAR2(20)
 POW						    VARCHAR2(20)
 EMAIL				   NOT NULL VARCHAR2(30)

```
ID 使用序列生成 就没有设置setter
完成实体类

完成
