package progetto2022_lpo21_49.parser;

import java.io.IOException;

public interface Tokenizer extends AutoCloseable {

	TokenType next() throws TokenizerException;

	TokenType tokenType();

	String tokenString();

	int intValue();

	boolean boolValue();

	void close() throws IOException;

	int getLineNumber();

}