package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_= {@Autowired})
	public BoardMapper mapper;

	
	@Test
	public void testInsert() {
		
		for(int i=0; i<10; i++) {
			
			BoardVO vo = new BoardVO();
			
			vo.setTitle("제목.." + i);
			vo.setContent("내용.." + i);
			vo.setWriter("작성자.." + i);
			
			log.info(mapper.insert(vo));
		}
	}
	
	@Test
	public void testSelect() {
		
		log.info(mapper.read(10l));
		
	}
	
	@Test
	public void testList() {
		
		mapper.list(new Criteria(2)).forEach(vo -> log.info(vo));
		
	}
	
	@Test
	public void testUpdate( ) {
		
		BoardVO vo = new BoardVO();
		
		vo.setBno(5l);
		vo.setTitle("죄목");
		vo.setContent("네마리용");
		
		
		mapper.update(vo);
	}
	
	@Test
	public void testDelte() {
		mapper.delete(1l);
	}
	
}
