import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * description: 使用MyBatis逆向生成pojo、dao、mapper文件。此模板可以正确生成。
 * @author: JiuDongDong
 * date: 2018/5/29.
 */
public class GeneratorSqlmap {

    public void generator() throws Exception{
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("src\\main\\resources\\generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    //生成逆向文件
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
