
| 자료구조 | add/offer | remove/poll | get/peek | Contains/containsKey | next | 정렬 가능 여부 | 정렬 시간복잡도 | 특징 |
|---|---|---|---|---|---|---|---|---|
| **ArrayList** | O(1) | O(n) | O(1) | O(n) | O(n) | 가능 | O(n log n) | 데이터 추가,삭제를 위해 임시 배열을 생성해 데이터를 복사 |
| **LinkedList** | O(1) | O(1) | O(n) | O(n) | O(1) | 가능 | O(n log n) | 데이터 추가/삭제시 빠름, 데이터 검색시 처음부터 노드를 순화해야 되기 때문에 느림 |
| **CopyOnWriteArrayList** | O(n) | O(n) | O(1) | O(n) | O(n) | 가능 | O(n log n) | 처리에 여분의 오버로드를 가져오지만 순회 작업의 수에 비해 수정 횟수가 최소일때 효과적 |
| **HashSet** | O(1) | - | - | O(1) | O(h/n) | 불가능 | - | 객체들을 순서없이 저장하고 동일한 객체를 중복 저장하지 않는다. |
| **LinkedHashSet** | O(1) | - | - | O(1) | O(1) | 불가능 | - | 속도는 hashSet에 비해 느리지만 좋은 성능을 보장한다. |
| **CopyOnWriteArraySet** | O(1) | - | - | O(1) | O(1) | 불가능 | - | 적은 메모리를 사용, 빠르다 |
| **TreeSet** | O(log n) | - | - | O(log n) | O(long n) | 가능 | - | 객체기준으로 정렬을 한다. 느리다. |
| **ConcurrentSkipListSet** | O(log n) | - | - | O(log n) | O(1) | 가능 | - | Null을 허용하지 않는다. 정렬을 한다. |
| **HashMap** | - | - | O(1) | O(1) | O(h/n) | 불가능 | - | 순서에 상관없이 저장됨, Null을 허용한다. |
| **LinkedHashMap** | - | - | O(1) | O(1) | O(1) | 불가능 | - | 순서대로 등록한다. Null을 허용한다. |
| **IdentityHashMap** | - | - | O(1) | O(1) | O(h/n) | 불가능 | - | Map 형식에 부합되지 않음 |
| **EnumMap** | - | - | O(1) | O(1) | O(1) | 불가능 | - | - |
| **TreeMap** | - | - | O(log n) | O(log n) | O(log n) | 가능 | - | 정렬이 되면서 추가가 됨, null은 허용하지 않음 |
| **ConcurrentHashMap** | - | - | O(1) | O(1) | O(h/n) | 불가능 | - | thread-safe 보장하면서 SynchronizedMap 보다 속도가 빠르다, null을 허용하지 않음 |
| **ConcurrentSkipListMap** | - | - | O(log n) | O(log n) | O(1) | 가능 | - | thread-safe 보장하면서 SynchronizedMap 보다 속도가 빠르다, 메모리를 사용하여 O(log n)으로 데이터를 검색, 삽입, 삭제가 가능하다 |
| **PriorityQueue** | O(log n) | O(log n) | O(1) | - | - | 가능 | - | 일반적은 큐는 FIFO의 구조를 가지지만 자연 네추럴 오더에 따라 정렬 |
| **ConcurrentLinkedQueue** | O(1) | O(1) | O(1) | - | - | 불가능 | - | FIFO 방식 Queue, 데이터/추가/삭제가 빠름 |
| **ArrayBlockingQueue** | O(1) | O(1) | O(1) | - | - | 불가능 | - | 고정배열에 일반적인 Queue(FIFO), 배열이 고정된 사이즈, 생성되면 변경 안됨 |
| **LinkedBlockingQueue** | O(1) | O(1) | O(1) | - | - | 불가능 | - | FIFO 정렬, 크기를 지정하지 않을 경우 Integer.MAX_VALUE와 동일하게 생성됨, 삽입이 동적임 |
| **PriorityBlockingQueue** | O(log n) | O(log n) | O(1) | - | - | 가능 | - | PriorityQueue 와 같은 정렬식으로 저장, 논리적으로 한대로 추가 가능 |
| **DelayQueue** | O(log n) | O(log n) | O(1) | - | - | 가능 | - | 지연이 만료 되었을 때문 요소를 가져올수있다. |
| **ArrayDeque** | O(1) | O(1) | O(1) | - | - | 가능 | O(n log n) | 양 측면에서 요소를 추가하거나 제거 할수 있는 확장 가능한 배열의 특별한 종류 |
| **LinkedBlockingDeque** | O(1) | O(1) | O(1) | - | - | 가능 | O(n log n) | 무제한으로 인스턴스화 할수 있음 |

| 자료구조/메서드 | add/offer | remove/poll | get/peek | Contains/containsKey | next | 정렬 가능 여부 | 정렬 시간복잡도 | 특징 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| ArrayList | O(1) | O(n) | O(1) | O(n) | O(n) | 가능 | O(n log n) | 데이터 추가,삭제를 위해 임시 배열을 생성해 데이터를 복사 |
| LinkedList | O(1) | O(1) | O(n) | O(n) | O(1) | 가능 | O(n log n) | 데이터 추가/삭제시 빠름, 데이터 검색시 처음부터 노드를 순화해야 되기 때문에 느림 |
| Arrays.sort() | - | - | - | - | - | 가능 | O(n log n) | Dual-Pivot Quicksort 알고리즘을 사용해 배열을 정렬 |
| Arrays.binarySearch() | - | - | - | - | - | 불가능 | O(log n) | 정렬된 배열에서 특정 요소를 이진 검색 알고리즘을 사용해 찾습니다. |
| Arrays.equals() | - | - | - | - | - | 불가능 | O(n) | 두 배열이 같은지 비교합니다. 두 배열의 모든 요소를 비교해야 하므로 시간 복잡도는 O(n)입니다. |
| Arrays.fill() | - | - | - | - | - | 불가능 | O(n) | 모든 배열의 요소를 특정 값으로 채웁니다. 모든 요소에 접근해야 하므로 시간 복잡도는 O(n)입니다. |
| Arrays.copyOf() | - | - | - | - | - | 불가능 | O(n) | 배열의 특정 부분을 복사해 새 배열을 만듭니다. 복사할 요소의 수에 따라 시간 복잡도는 O(n)입니다. |
| Arrays.asList() | - | - | - | - | - | 불가능 | O(1) | 배열을 ArrayList로 변환합니다. 이 연산은 상수 시간을 필요로 합니다. |
| Collections.sort() | - | - | - | - | - | 가능 | O(n log n) | 리스트를 정렬하는 메서드로, TimSort 또는 Adaptive MergeSort 알고리즘을 사용합니다. |
| Collections.binarySearch() | - | - | - | - | - | 불가능 | O(log n) | 정렬된 리스트에서 특정 요소를 이진 검색 알고리즘을 사용해 찾습니다. |
| Collections.reverse() | - | - | - | - | - | 가능 | O(n) | 리스트의 요소를 역순으로 정렬합니다. |
| Collections.shuffle() | - | - | - | - | - | 가능 | O(n) | 리스트의 요소를 무작위로 섞습니다. |
| Collections.swap() | - | - | - | - | - | 불가능 | O(1) | 리스트의 두 요소의 위치를 바꿉니다. |
| Collections.max() | - | - | - | - | - | 불가능 | O(n) | 컬렉션에서 최대 요소를 찾습니다. |
| Collections.min() | - | - | - | - | - | 불가능 | O(n) | 컬렉션에서 최소 요소를 찾습니다. |