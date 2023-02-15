package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/*엔티티 보드리스트에서 공유*/
import com.finalProject.entity.Boardlist;

public interface BoardlistRepository extends JpaRepository<Boardlist, Integer> {

//	delete 메서드
	// void delete(Integer id);

	// 기본적으로 제공하는 JpaRepository를 상속받아 만들면 된다.

	// JpaRepository는 PagingAndSortingRepository를 상속받았고 PagingAndSortingRepository는
	// CrudRepository(기본적인 CRUD 기능을 제공한다)를 상속 받았으며 다시 CrudRepository는 Repository
	// 인터페이스를 상속받았다.

	// 그러므로 JpaRepository는 모든 기능을 다 사용할 수 있고 추가적으로 영속성 컨텍스트에 flush하거나 엔티티를 배치로 삭제할 수
	// 있다.

}
