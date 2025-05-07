package ch19_generic.products;
/*
    1. ProductController 생성
    다양한 타입의 상품 정보를 저장하고, 출력하는 코드 작성.

    실행 예시
        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD)
        Product(productName=SmartPhone, productInfo=799.99)
        Product(productName=Available, productInfo=true)
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {
    private String productName;
    private T productInfo;

}
