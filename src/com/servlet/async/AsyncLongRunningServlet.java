package com.servlet.async;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class AsyncLongRunningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		long startTime = System.currentTimeMillis();
//
//		AsyncContext asyncCtx = request.startAsync();
//		asyncCtx.setTimeout(1000 * 3600);
//
//		asyncCtx.start(new AsyncRequestProcessor(asyncCtx));
//
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write("{\"success\"}");
		pw.close();
	}

	public static void main(String[] args) {
		String str = "[{ font_file_name: 'ttf1.ttf', sub_file_name: 'ttf1_sub.ttf', sample_file_name: 'ttf1_sam.ttf' }, { font_file_name: 'ttf2.ttf', sub_file_name: 'ttf2_sub.ttf', sample_file_name: 'ttf2_sam.ttf' }, { font_file_name: 'ttf3.ttf', sub_file_name: 'ttf3_sub.ttf', sample_file_name: 'ttf3_sam.ttf' }, { font_file_name: 'ttf4.ttf', sub_file_name: 'ttf4_sub.ttf', sample_file_name: 'ttf4_sam.ttf' }, { font_file_name: 'ttf5.ttf', sub_file_name: 'ttf5_sub.ttf', sample_file_name: 'ttf5_sam.ttf' }, { font_file_name: 'ttf6.ttf', sub_file_name: 'ttf6_sub.ttf', sample_file_name: 'ttf6_sam.ttf' }, { font_file_name: 'ttf7.ttf', sub_file_name: 'ttf7_sub.ttf', sample_file_name: 'ttf7_sam.ttf' }, { font_file_name: 'ttf8.ttf', sub_file_name: 'ttf8_sub.ttf', sample_file_name: 'ttf8_sam.ttf' }, { font_file_name: 'ttf9.ttf', sub_file_name: 'ttf9_sub.ttf', sample_file_name: 'ttf9_sam.ttf' }]";
		List<Map> dataList = JSON.parseArray(str, Map.class);
		for (Map map : dataList) {
			System.out.println(map.get("font_file_name"));
		}
	}

}
