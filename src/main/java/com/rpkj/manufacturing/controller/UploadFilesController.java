package com.rpkj.manufacturing.controller;

import com.rpkj.manufacturing.entity.FileVO;
import com.rpkj.manufacturing.util.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @version V1.0.0
 * @Title: UploadFilesController
 * @Package com.test.demo.controller
 * @Description: 上传文件controller
 * @author: 张恩铭
 * @date: 2020/9/18 13:10
 */
@CrossOrigin
@RestController
@RequestMapping("/api/files")
public class UploadFilesController {

    @PostMapping("/upload")
    @ResponseBody
    public HashMap<String, Object> uploadFiles(HttpServletRequest httpServletRequest,String project) throws Exception {
        List<MultipartFile> uploadFiles = ((MultipartHttpServletRequest) httpServletRequest).getFiles("file");
//        File file1 = new File("C:\\Users\\xhj\\Desktop\\文件\\personnel\\"+project);
        File file1 = new File("D:\\Program Files\\nginx-1.16.1\\nginx-1.16.1\\html\\project01\\pdf\\"+project);
        if(!file1.exists()){
            file1.mkdirs();
        }
        HashMap<String, Object> h = new HashMap<>();
        if (uploadFiles != null) {
            if (uploadFiles.size() > 0) {
                for (MultipartFile f : uploadFiles) {
//                    if ("pdf".equals(f.getName())) {
                    File file = new File("D:\\Program Files\\nginx-1.16.1\\nginx-1.16.1\\html\\project01\\pdf\\"+project+"\\" + f.getOriginalFilename());
//                    File file = new File("C:\\Users\\xhj\\Desktop\\文件\\personnel\\"+project+"\\" + f.getOriginalFilename());

                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
                    out.write(f.getBytes());
                    out.flush();
                    out.close();
//                    }
                }
                h.put("result", "success");
            } else {
                h.put("result", "empty");
            }
        } else {
            h.put("result", "null");
        }
        return h;
    }
    @GetMapping("/list")
    public R getList(String project) {
        /// 需要吧这个文件下的文件名 文件大小 遍历出来 放到 List 中
//        String property = System.getProperty("user.dir");
//        String path =property+"\\文件\\"+poject;
        List<FileVO> list = new ArrayList<>();
//        File f = new File("C:\\Users\\xhj\\Desktop\\文件\\personnel\\" + project);
        File f = new File("D:\\Program Files\\nginx-1.16.1\\nginx-1.16.1\\html\\project01\\pdf\\" + project);
        File fa[] = f.listFiles();
        if (fa==null ||fa.length==0){
            return R.ok().data("list",list);
        }
        for (int i = 0; i < fa.length; i++) {
            FileVO fileVO = new FileVO();
            File fs = fa[i];
            if (!fs.isDirectory()) {
                fileVO.setName(fs.getName());
                fileVO.setSize((fs.length()/1024)+1);
                list.add(fileVO);
            }
        }


        return R.ok().data("list",list);
    }

    @GetMapping("/del")
    public R getdelete(String project,String fileName) {


        // File file = new File("C:\\Users\\xhj\\Desktop\\文件\\personnel\\" + fileName + "\\" + project);
        File file = new File("D:\\Program Files\\nginx-1.16.1\\nginx-1.16.1\\html\\project01\\pdf\\" + fileName + "\\" + project);
        if (file.isFile() && file.exists()) {
            file.delete();
            System.out.println("删除单个文件" + fileName + "成功！");
            return R.ok();
        } else {
            System.out.println("删除单个文件" + fileName + "失败！");
            return R.error();


        }
    }
}
