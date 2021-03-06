#설계 개선하기
## 캡슐화
개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 캡슐화하고 한다. 
캡슐화의 목적은 변경하기 쉬운 객체를 만드는 것이다. 
캡슐화를 통해 객체 내부로의 접근을 제한하면 객체와 객체 사이의 결합도를 낮출 수 있기 때문에 설계를 쉽게 변경할 수 있다. 

## 설계원칙
Theater는 오직 TickerSeller의 인터페이스에만 의존한다. TicketSeller가 내부에 Ticketoffice 인스턴스를 포함하고 있다느 사실은 구현영역에 속한다.
객체를 인터페이스와 구현으로 나누고 인터페이스만을 공개하는 것은 객체 사이의 결합도를 낮추고 변경하기 쉬운 코드이다.

## 개선방법
각 객체들이 해야할 일은 각 객체 내부에서 구현되어야한다.

## 캡슐화와 응집도
핵심은 객체 내부의 상태를 캡슐화하고 객체 간에 오직 메시지를 통해서만 상호작용하도록 만드는 것이다.  
객체(Object1)에서 객체(Object2)를 호출할 때 Object1은 Object2의 내부에 대해서 알지 못하여도 상관없다. 단 메서드에 응답할 수 있고 자신이 원하는 결과를 반환할 것이라는 사실만 할 고 있으면 된다.

### 응집도
밀접하게 연관된 작업만을 수행하고 연관성 없는 작업은 다른 객체에게 위임하는 객체를 가리켜 응집가 높다고 한다.  
자신의 데이터를 스스로 처리하는 자율적인 객체를 만들면 결합도를 낮출 수 있을 뿐더러 응집도를 높일 수 있다.

## 절차지향과 객체지향
### 절차지향
프로세스와 데이터를 별도의 모듈에 위치시키는 방식을 절차적 프로그래밍(Procedural Programming)이라고 한다.  
모든 처리가 하나의 클래스 안에 위치하고 나머지 클래스는 단지 데이터의 역할만 수행하는 방식이다.  
절차지향 프로그램의 단점으로는 데이터의 변경으로 인한 영향을 지역적으로 고립시키기 어렵다. 데이터 객체의 내부 구현을 변경하려면 프로세스의 로직도 함께 변경해야한다. 즉 변경은 버그를 생성하고 코드의 수정을 어렵게 한다.


### 객체지향
자신의 데이터를 스스로 처리하도록 각 객체 내부에 구현하는 것, 즉 데이터를 사용하는 프로세스가 데이터를 소유하고 있도록 프로그래밍하는 방식을 객체지향 프로그래밍(Object-Oriented Programming)이라고 부른다.  
객체지향 프로그래밍 방식은 의존성이 낮아 하나의 변경으로 여러 클래스를 수정할 일이 적어진다. 훌륭한 객체지향 설계의 핵심은 캡슐화로 객체간 의존성을 낮추어 결합도를 낮추는 것이다.  
객체지향 코드는 자신의 문제를 스스로 처리해야한다는 우리의 예상을 만족시켜주기때문에 이해하기 쉽고, 객체 내부의 변경이 외부에 영향을 끼치지 않기 때문에 변경도 용이하다.

## 책임의 이동
위의 두 방식 사이에 근본적인 차이를 만드는 것은 책임의 이동(shift of responsibility)이다.  
절차지향 방식은 책임이 프로세스 클래스에 집중되어 있다. 반면에 객체지향 방식은 책임이 여러 객체에 분산되어 있다. 각 객체는 자신을 스스로 책임진다.

간단히 정리하자면 데이터 객체와 데이터 객체를 사용하는 프로세스가 별도의 객체에 위치하고 있다면 절차적 프로그래밍 방식이다.  
데이터와 데이터를 사용하는 프로세스가 동일한 객체 안에 위치한다면 객체지향 프로그래밍 방식을 따르고 있을 확률이 높다.

객체지향 설계의 핵심은 적절한 객체에 적절한 책임을 할당하는 것이다. 객체는 다른 객체와 특정한 역할을 수행하는데 필요한 적절한 책임을 수행해야한다. 객체가 어떤 데이터를 가지느냐보다는 객체에 어떤 책임을 할당할 것이냐에 초점을 맞추자.

설계를 어렵게 만드는 것은 의존성이다. 해결 방법은 불필요한 의존성을 제거함으로써 객체 사이의 결합도를 낮추는 것이다. 불필요한 세부사항을 객체 내부로 캡슐화하는 것은 객체의 자율성을 높이고 응집도 높은 객체들의 공동체를 창조할 수 있게 된다. 불필요한 세부사항을 캡슐화하는 자율적인 객체들이 낮은 결합도와 높은 응집도를 가지고 협력하도록 최소한의 의존성만을 남기는 것이 훌륭한 객체지향이다.