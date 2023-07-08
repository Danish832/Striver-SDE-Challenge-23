class GfG
{
    
    Node merge(Node headA , Node headB) {
        Node newList = new Node(0) ;
        Node dummy = newList ;
        
        Node temp1 = headA ;
        Node temp2 = headB ;
        
        while(temp1!=null && temp2!=null){
            if(temp1.data > temp2.data){
                dummy.bottom = temp2 ;
                temp2 = temp2.bottom ;
            }

            else {
                dummy.bottom = temp1 ;
                temp1 = temp1.bottom ;
            }

            dummy = dummy.bottom ;
        }

        while(temp1!=null){
            
            dummy.bottom = temp1 ;
            dummy = dummy.bottom ;
            temp1 = temp1.bottom ;
        }

        while(temp2!=null){
            
            dummy.bottom = temp2 ;
            dummy = dummy.bottom ;
            temp2 = temp2.bottom ;
        }

        return newList.bottom ;
        
        
    }
    
    Node flatten(Node root)
    {
        if(root.next == null) return root ;
        
        Node pos = root.next ;
       // Node temp1 = root ;
        
        while(pos!=null){
            
        
      //  Node pos = root.next ;
        
            root = merge(root,pos) ;
            if(pos.next != null){
                root.next = pos.next ;
            }
            pos = pos.next ;
        }
        return root ;
        
    }
}