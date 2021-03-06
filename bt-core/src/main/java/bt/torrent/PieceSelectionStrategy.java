package bt.torrent;

import java.util.function.Predicate;

/**
 * Implements a particular piece selection algorithm.
 *
 * @since 1.0
 */
public interface PieceSelectionStrategy {

    /**
     * Returns an array of piece indices, selected from the overall piece statistics
     *
     * @param pieceStats Per-torrent piece statistics
     * @param limit Upper bound for the number of indices to collect
     * @param pieceIndexValidator Tells whether piece index might be selected.
     *                            Only pieces for which this function returns true have a chance to be selected.
     * @return Array of length lesser than or equal to {@code limit}
     * @since 1.0
     */
    Integer[] getNextPieces(PieceStatistics pieceStats, int limit, Predicate<Integer> pieceIndexValidator);
}
