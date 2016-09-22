/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A2-MinimalAST\\src\\jastadd\\lang.ast:2
 * @production Func : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">Args:{@link Stat}*</span> <span class="component">Stats:{@link Stat}*</span>;

 */
public class Func extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect MSN
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A2-MinimalAST\\src\\jastadd\\MSN.jrag:28
   */
  public void getDepth(PrintStream out, depthTable depth, int d) {
		if(hasStats()) {
				for (int i = 0; i < getNumStats(); ++i) {
					getDepth(out, depth, d + 1);
			}
			depth.add(d + 1);
		}
	
	}
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A2-MinimalAST\\src\\jastadd\\Prettyprint.jrag:15
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getID());
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A2-MinimalAST\\src\\jastadd\\Visitor.jrag:50
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Func() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[2];
    setChild(new List(), 0);
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Func(String p0, List<Stat> p1, List<Stat> p2) {
    setID(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /**
   * @declaredat ASTNode:20
   */
  public Func(beaver.Symbol p0, List<Stat> p1, List<Stat> p2) {
    setID(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Func clone() throws CloneNotSupportedException {
    Func node = (Func) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Func copy() {
    try {
      Func node = (Func) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:62
   */
  @Deprecated
  public Func fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Func treeCopyNoTransform() {
    Func tree = (Func) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:92
   */
  public Func treeCopy() {
    Func tree = (Func) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((Func) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the Args list.
   * @param list The new list node to be used as the Args list.
   * @apilevel high-level
   */
  public void setArgsList(List<Stat> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Args list.
   * @return Number of children in the Args list.
   * @apilevel high-level
   */
  public int getNumArgs() {
    return getArgsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Args list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Args list.
   * @apilevel low-level
   */
  public int getNumArgsNoTransform() {
    return getArgsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Args list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Args list.
   * @apilevel high-level
   */
  public Stat getArgs(int i) {
    return (Stat) getArgsList().getChild(i);
  }
  /**
   * Check whether the Args list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasArgs() {
    return getArgsList().getNumChild() != 0;
  }
  /**
   * Append an element to the Args list.
   * @param node The element to append to the Args list.
   * @apilevel high-level
   */
  public void addArgs(Stat node) {
    List<Stat> list = (parent == null) ? getArgsListNoTransform() : getArgsList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addArgsNoTransform(Stat node) {
    List<Stat> list = getArgsListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Args list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setArgs(Stat node, int i) {
    List<Stat> list = getArgsList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Args list.
   * @return The node representing the Args list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Args")
  public List<Stat> getArgsList() {
    List<Stat> list = (List<Stat>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Args list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Args list.
   * @apilevel low-level
   */
  public List<Stat> getArgsListNoTransform() {
    return (List<Stat>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Args list without
   * triggering rewrites.
   */
  public Stat getArgsNoTransform(int i) {
    return (Stat) getArgsListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Args list.
   * @return The node representing the Args list.
   * @apilevel high-level
   */
  public List<Stat> getArgss() {
    return getArgsList();
  }
  /**
   * Retrieves the Args list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Args list.
   * @apilevel low-level
   */
  public List<Stat> getArgssNoTransform() {
    return getArgsListNoTransform();
  }
  /**
   * Replaces the Stats list.
   * @param list The new list node to be used as the Stats list.
   * @apilevel high-level
   */
  public void setStatsList(List<Stat> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Stats list.
   * @return Number of children in the Stats list.
   * @apilevel high-level
   */
  public int getNumStats() {
    return getStatsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Stats list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Stats list.
   * @apilevel low-level
   */
  public int getNumStatsNoTransform() {
    return getStatsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Stats list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Stats list.
   * @apilevel high-level
   */
  public Stat getStats(int i) {
    return (Stat) getStatsList().getChild(i);
  }
  /**
   * Check whether the Stats list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasStats() {
    return getStatsList().getNumChild() != 0;
  }
  /**
   * Append an element to the Stats list.
   * @param node The element to append to the Stats list.
   * @apilevel high-level
   */
  public void addStats(Stat node) {
    List<Stat> list = (parent == null) ? getStatsListNoTransform() : getStatsList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addStatsNoTransform(Stat node) {
    List<Stat> list = getStatsListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Stats list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setStats(Stat node, int i) {
    List<Stat> list = getStatsList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Stats list.
   * @return The node representing the Stats list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Stats")
  public List<Stat> getStatsList() {
    List<Stat> list = (List<Stat>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Stats list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stats list.
   * @apilevel low-level
   */
  public List<Stat> getStatsListNoTransform() {
    return (List<Stat>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Stats list without
   * triggering rewrites.
   */
  public Stat getStatsNoTransform(int i) {
    return (Stat) getStatsListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Stats list.
   * @return The node representing the Stats list.
   * @apilevel high-level
   */
  public List<Stat> getStatss() {
    return getStatsList();
  }
  /**
   * Retrieves the Stats list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stats list.
   * @apilevel low-level
   */
  public List<Stat> getStatssNoTransform() {
    return getStatsListNoTransform();
  }
}
